package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1_2 {
    private static final int SIZE = 10000000;

    public static void main(String[]args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        startTest(list1, list2);
    }


    private static <T extends List<Integer>> void fillList(T list){
        for (int i = 0; i < SIZE; i++) list.add(i);
    }

    private static <T extends List<Integer>> void startTest(T... list){
        fillList(list[0]); fillList(list[1]);
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 7; i++) {
            long start_ = System.currentTimeMillis();
            list[0].remove((int) Math.pow(10, i) - i);
            System.out.println("Element " + ((int) Math.pow(10, i) - i) +
                    " was removed by " + (System.currentTimeMillis() - start_) + " ms");
        }
        long time1 = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 1; i <= 7; i++) {
            long start_ = System.currentTimeMillis();
            list[1].remove((int) Math.pow(10, i) - i);
            System.out.println("Element " + ((int) Math.pow(10, i) - i) +
                    " was removed by " + (System.currentTimeMillis() - start_) + " ms");
        }
        long time2 = System.currentTimeMillis() - start;
        System.out.println("1st list tested by " + time1 + " ms");
        System.out.println("2st list tested by " + time2 + " ms");
    }
}
