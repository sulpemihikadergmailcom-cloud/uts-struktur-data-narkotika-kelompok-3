package com.kelompok.narkotika;

import com.kelompok.narkotika.structure.DynamicArray;
import com.kelompok.narkotika.structure.AlgoritmaPutusan;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class AlgoritmaPutusanTest {

    @Test
    void testLinearSearch() {
        DynamicArray<Integer> array = new DynamicArray<>();

        array.add(10);
        array.add(20);
        array.add(30);

        assertEquals(
                1,
                AlgoritmaPutusan.linearSearch(array, 20)
        );
        assertEquals(
                -1,
                AlgoritmaPutusan.linearSearch(array, 40)
        );
    }
    @Test
    void testBinarySearch() {
        DynamicArray<Integer> array = new DynamicArray<>();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        assertEquals(
                2,
                AlgoritmaPutusan.binarySearch(
                        array, 30, Comparator.naturalOrder()
                )
        );
        assertEquals(
                -1,
                AlgoritmaPutusan.binarySearch(
                        array, 50, Comparator.naturalOrder()
                )
        );
    }
    @Test
    void testInsertionSort() {
        DynamicArray<Integer> array = new DynamicArray<>();

        array.add(30);
        array.add(10);
        array.add(20);

        AlgoritmaPutusan.insertionSort(
                array, Comparator.naturalOrder()
        );

        assertEquals(10, array.get(0));
        assertEquals(20, array.get(1));
        assertEquals(30, array.get(2));
    }

    @Test
    void testMergeSort() {
        DynamicArray<Integer> array = new DynamicArray<>();

        array.add(40);
        array.add(10);
        array.add(30);
        array.add(20);

        AlgoritmaPutusan.mergeSort(
                array, Comparator.naturalOrder()
        );

        assertEquals(10, array.get(0));
        assertEquals(20, array.get(1));
        assertEquals(30, array.get(2));
        assertEquals(40, array.get(3));
    }

    @Test
    void testMergeSortEmptyArray() {
        DynamicArray<Integer> array = new DynamicArray<>();

        AlgoritmaPutusan.mergeSort(
                array, Comparator.naturalOrder()
        );

        assertTrue(array.isEmpty());
    }
}
