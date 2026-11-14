package com.kelompok.narkotika;

import com.kelompok.narkotika.structure.CustomStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomStackTest {

    @Test
    void testPushAndPeek() {
        CustomStack<String> stack = new com.kelompok.narkotika.structure.CustomStack<>();

        stack.push("Tambah");
        stack.push("Hapus");

        assertEquals("Hapus", stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    void testPop() {
        CustomStack<String> stack = new CustomStack<>();

        stack.push("Tambah");
        stack.push("Hapus");

        assertEquals("Hapus", stack.pop());
        assertEquals("Tambah", stack.peek());
        assertEquals(1, stack.size());
    }
    @Test
    void testIsEmpty() {
        CustomStack<String> stack = new CustomStack<>();

        assertTrue(stack.isEmpty());

        stack.push("Tambah");

        assertFalse(stack.isEmpty());
    }

    @Test
    void testClear() {
        CustomStack<String> stack = new CustomStack<>();

        stack.push("Tambah");
        stack.push("Hapus");

        stack.clear();

        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    void testPopFromEmptyStack() {
        CustomStack<String> stack = new CustomStack<>();

        assertThrows(
                IllegalStateException.class,
                stack::pop
        );
    }

    @Test
    void testPeekFromEmptyStack() {
        CustomStack<String> stack = new CustomStack<>();

        assertThrows(
                IllegalStateException.class,
                stack::peek
        );
    }
}
