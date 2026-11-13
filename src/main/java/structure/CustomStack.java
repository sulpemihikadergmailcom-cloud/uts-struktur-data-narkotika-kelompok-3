package com.kelompok.narkotika.structure;

import java.util.Objects;

public class CustomStack<T> {

    private Objects[] data;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomStack() {
        data = new Objects[DEFAULT_CAPACITY];
        top = -1;
    }

    public CustomStack(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException(
                    "Kapasitas harus lebih dari 0"
            );
        }

        data = new Objects[capacity];
        top = -1;
    }

    private void ensureCapacity() {
        if (top == data.length - 1) {
            Object[] newData = new Object[data.length * 2];

            for (int i = 0; i < data.length; i++){
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    public void push(T value) {
        ensureCapacity();
        top++;
        data[top] = value;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException(
                    "Stack kosong, tidak bisa pop"
            );
        }


        T value = (T) data[top];
        data[top] = null;
        top--;

        return value;
    }

    @SuppressWarnings("unchecked")
    public  T peek() {
        if (isEmpty()) {
            throw new IllegalStateException(
                    "Stack kosong"
            );
        }

        return (T) data[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void clear() {
        while (!isEmpty()) {
            data[top] = null;
            top--;
        }
    }

    public void display() {
        System.out.println("Isi Stack:");

        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
