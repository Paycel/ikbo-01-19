package com.company;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static Object[] elements = new Object[5];

    // insert
    public static void enqueue(Object element) {
        assert element != null;  // pre-condition
        ensureCapacity(size + 1);
        elements[size++] = element; // inv: size >= 0
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) // pre-condition
            elements = Arrays.copyOf(elements, 2 * capacity); // inv: capacity <= elements.length
    }

    // pop
    public static Object dequeue() {
        assert size > 0;  // pre-condition
        Object element = elements[0];
        System.arraycopy(elements, 1, elements, 0, --size);
        return element; // inv: size >= 0
    }

    public static Object peek() {
        assert size > 0;  // pre-condition
        return elements[0]; // inv: size >= 0
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }
}
