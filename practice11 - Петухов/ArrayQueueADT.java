package com.company;

import java.util.Arrays;

public  class ArrayQueueADT {
    private int size;
    private Object[] elements = new Object[10];

    // insert
    public static void enqueue(ArrayQueueADT stack, Object element) {
        assert element != null;  // pre-condition
        ensureCapacity(stack, stack.size + 1);
        stack.elements[stack.size++] = element; // stack.size >= 0
    }

    private static void ensureCapacity(ArrayQueueADT stack, int capacity) {
        if (capacity > stack.elements.length)  // pre-condition
            stack.elements = Arrays.copyOf(stack.elements, 2 * capacity); // inv: capacity <= elements.length
    }

    // pop
    public static Object dequeue(ArrayQueueADT stack) {
        assert stack.size > 0;  // pre-condition
        Object element = stack.elements[0];
        System.arraycopy(stack.elements, 1, stack.elements, 0, --stack.size);
        return element; // inv: stack.size >= 0
    }

    public static Object peek(ArrayQueueADT stack) {
        assert stack.size > 0;  // pre-condition
        return stack.elements[0]; // inv: stack.size >= 0
    }

    public static int size(ArrayQueueADT stack) {
        return stack.size;
    }

    public static boolean isEmpty(ArrayQueueADT stack) {
        return stack.size == 0;
    }
}
