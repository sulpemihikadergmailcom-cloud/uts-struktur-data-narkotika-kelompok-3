
package com.kelompok.narkotika.structure;

import java.util.Comparator;
import java.util.Objects;

public class AlgoritmaPutusan {

    private AlgoritmaPutusan() {
    }

    public static <T> int linearSearch(
            DynamicArray<T> array,
            T target
    ) {
        for (int i = 0; i < array.size(); i++) {
            if (Objects.equals(array.get(i), target)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int binarySearch(
            DynamicArray<T> array,
            T target,
            Comparator<? super T> comparator
    ) {
        int kiri = 0;
        int kanan = array.size() - 1;

        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;

            int hasil = comparator.compare(
                    array.get(tengah), target
            );

            if (hasil == 0) {
                return tengah;
            } else if (hasil < 0) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }

        return -1;
    }

    public static <T> void insertionSort(
            DynamicArray<T> array,
            Comparator<? super T> comparator
    ) {
        for (int i = 1; i < array.size; i++) {
            T key = array.get(i);
            int j = i - 1;

            while (j >= 0 &&
                    comparator.compare(array.get(j), key) > 0) {
                array.set(j + 1, array.get(j));
                j--;
            }

            array.set(j + 1, key);
        }
    }

    public static <T> void mergeSort(
            DynamicArray<T> array,
            Comparator<? super T> comparator
    ) {
        if (array.size() <= 1) {
            return;
        }

        Object[] temporary = new Object[array.size()];

        mergeSortRecursive(
                array, temporary, 0, array.size() - 1, comparator
        );
    }

    private static <T> void mergeSortRecursive(
            DynamicArray<T> array,
            Object[] temporary,
            int left,
            int right,
            Comparator<? super T> comparator
    ) {
        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;

        mergeSortRecursive(
                array, temporary, left, middle, comparator
        );

        mergeSortRecursive(
                array, temporary, middle + 1, right, comparator
        );

        merge(
                array, temporary, left, middle, right, comparator
        );
    }

    @SuppressWarnings("unchecked")
    private static <T> void merge(
            DynamicArray<T> array,
            Object[] temporary,
            int left,
            int middle,
            int right,
            Comparator<? super T> comparator
    ) {
        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            T valueLeft = array.get(i);
            T valueRight = array.get(j);

            if (comparator.compare(valueLeft, valueRight) <= 0) {
                temporary[k++] = valueLeft;
                i++;
            } else {
                temporary[k++] = valueRight;
                j++;
            }
        }

        while (i <= middle) {
            temporary[k++] = array.get(i++);
        }

        while (j <= right) {
            temporary[k++] = array.get(j++);
        }

        for (int index = left; index <= right; index++) {
            array.set(index, (T) temporary[index]);
        }
    }
}
