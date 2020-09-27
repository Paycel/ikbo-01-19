package com.company;

public class Main {

    public static void main(String[] args) {
        WaitList<Integer> boundWaitList = new BoundedWaitList<>(15);
        UnfairWaitList<Integer> unfWaitList = new UnfairWaitList<>();

        for (int i = 0; i < 15; i++) boundWaitList.add(i);
        System.out.println(boundWaitList);
        boundWaitList.add(15); // print error
        System.out.println(boundWaitList);

        for (int i = 0; i < 10; i++) unfWaitList.add(i);
        unfWaitList.add(4);
        System.out.println(unfWaitList);
        unfWaitList.remove(); // removed first element
        System.out.println(unfWaitList);
        unfWaitList.remove(4); // first '4' removed
        System.out.println(unfWaitList);
        unfWaitList.moveToBack(6); // add '6' to the end of queue
        System.out.println(unfWaitList);
    }
}
