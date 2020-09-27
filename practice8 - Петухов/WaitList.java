package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class WaitList<T> implements IWaitList<T> {
    protected ConcurrentLinkedQueue<T> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<T> c){
        this.content = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public T remove() {
        return content.remove();
    }

    @Override
    public boolean contains(T element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<T> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
