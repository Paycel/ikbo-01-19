package com.company;

import java.util.Arrays;

public class ArrayQueue {
    private int size;
    private Object[] elements = new Object[5];

    // insert
    public void enqueue(Object element) {
        assert element != null; // pre-condition
        ensureCapacity(size + 1);
        elements[size++] = element; // inv: size >= 0
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) // pre-condition
            elements = Arrays.copyOf(elements, 2 * capacity); // inv: capacity <= elements.length
    }

    // pop
    public Object dequeue() {
        assert size > 0; // pre-condition
        Object element = elements[0];
        System.arraycopy(elements, 1, elements, 0, --size);
        return element; // inv: size >= 0
    }

    public Object peek() {
        assert size > 0; // pre-condition
        return elements[0]; // inv: size >= 0
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
