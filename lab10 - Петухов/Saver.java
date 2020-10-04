package com.company;

public class Saver<E> {
    private E[] list;
    private int size;

    public Saver(int size) {
        list = (E[]) new Object[size];
        this.size = 0;
    }

    public void add(E element){
        if (size < list.length) list[size++] = element;
        else System.out.println("Array full");
    }
}
