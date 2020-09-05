package com.company;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        final int N = 10;
        int[] mass = new int[N];
        for (int i = 0; i < N; i++) {
            mass[i] = (int) (Math.random() * 20);
            System.out.print(mass[i] + " ");
        }
        Arrays.sort(mass);
        System.out.println();
        for (int i = 0; i < N; i++) System.out.print(mass[i] + " ");
    }
}







