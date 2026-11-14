package com.kelompok.narkotika;

import com.kelompok.narkotika.structure.DynamicArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    @Test
    void testAssAndGet() {
        DynamicArray<String> array = new DynamicArray<>();

        array.add("Putusan 1");
        array.add("Putusan 2");

        assertEquals(2, array.size());
        assertEquals("Putusan 1", array.get(0));
        assertEquals("Putusan 2", array.get(1));
    }

    @Test
    void testRemove() {
        DynamicArray<String> array = new DynamicArray<>();

        array.add("Putusan 1");
        array.add("Putusan 3");
        array.insert(1, "Putusan 2");

        assertEquals("Putusan 2", array.get(1));
        assertEquals(3, array.size());
    }

    @Test
    void testRemove() {
        DynamicArray<String> array = new DynamicArray<>();

        array.add("Putusan 1");
        array.add("Putusan 2");

        array.remove(0);

        assertEquals(1, array.size());
        assertEquals("Putusan 2", array.get(0));
    }

    @Test
    void testRemove() {
        DynamicArray<String> array = new DynamicArray<>();

        array.add("Putusan 1");

        assertTrue(array.contains("Putusan 1"));
        assertFalse(array.contains("Putusan 2"));
    }

    @Test
    void testClear() {
        DynamicArray<String> array = new DynamicArray<>();

        array.add("Putusan 1");
        array.clear();

        assertTrue(array.isEmpty());
        assertEquals(0, array.size());
    }

}
