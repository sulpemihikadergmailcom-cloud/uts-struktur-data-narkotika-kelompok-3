package com.kelompok.narkotika.structure;

import java.util.Arrays;
import  java.util.Objects;

public class DynamicArray<T> implements com.kelompok.narkotika.structure.StrukturData<T> {

    private  Object[] data;
    private int size;
    private static final  int DEFAULT_CAPACITY = 10;

    public DynamicArray() {
        data = new  Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public  DynamicArray(int capacity) {
        if (capacity < 1){
            throw new IllegalArgumentException();
        }
        data = new Object[capacity];
        size = 0;
    }
    private void ensureCapacity() {
        if ((size == data.length)) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }
    @Override
    public void add(T value) {
        ensureCapacity();
        data[size]= value;
        size++;

    }
    public  void insert(int index, T value) {
        if (index < 0 || index > size) {
            throw  new  indexOutOfBoundsException(
                    "Index tidak valid: " + index
            );

        }

        ensureCapacity();

        for ( int i = size; i > index; i--){
            data[i] = data[i- 1];
        }

        data[index] = value;
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int position) {
        checkIndex(position);
        return (T) data[position];

    }

    public void set(int index, T value) {
        checkIndex(index);
        data[index] = value;
    }

    @Override
    public T remove(int position) {
        checkIndex(position);

        @SuppressWarnings("unchecked")
        T removed = (T) data[position];

        for (int i = position; i < size - 1; i++){
            data[i] = data[i + 1];
        }

        size--;
        data[size]= null;

        return removed;
    }

    @Override
    public int size(){
        return size;
    }

    public int capacity(){
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(T value) {
            for (int i = 0; i < size; i++) {
                if (Objects.equals(data[i],value)){
                    return i;
                }
            }

            return -1;
        }

        @Override
        public void clear() {
            for (int i = 0; i < size; i++) {
                data[i] = null;
            }

            size = 0;
        }

        private void checkIndex(int index){
            if (index < 0 || >== size) {
                throw new IndexOutOfBoundsException(
                        "index di luar batas: " + index
                );
            }
        }

        public void display(){
            System.out.print(data[i] + " ");
        }

        System.out.println("]");
    }


}
