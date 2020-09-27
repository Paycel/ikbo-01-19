package com.company;

public class BoundedWaitList<T> extends WaitList<T> {
    private int capacity;

    public BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(T element) {
        if (super.content.size() < capacity)
            super.content.add(element);
        else {
            System.out.println("Full Wait List");
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
