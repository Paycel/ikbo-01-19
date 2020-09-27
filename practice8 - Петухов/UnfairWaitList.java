package com.company;

import java.util.Iterator;

public class UnfairWaitList<T> extends WaitList<T> {

    public UnfairWaitList(){
        super();
    }

    public void remove(T element){
        for (Iterator<T> iterator = super.content.iterator(); iterator.hasNext();){
            T value = iterator.next();
            if (value.equals(element)) {
                iterator.remove();
                break;
            }
        }
    }

    @Override
    public void add(T element) {
        super.content.add(element);
    }

    public void moveToBack(T element){
        for (Iterator<T> iterator = super.content.iterator(); iterator.hasNext();){
            T value = iterator.next();
            if (value.equals(element)) {
                iterator.remove();
                add(value);
                break;
            }
        }
    }
}
