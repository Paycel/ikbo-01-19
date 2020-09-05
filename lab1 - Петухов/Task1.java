package com.company;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        final int N = 10;
        int[] mass = new int[N];
        for (int i = 0; i < N; i++){
            mass[i] = (int)(Math.random()*20);
            sum += mass[i];
            System.out.print(mass[i] + " ");
        }
        System.out.println("\nSum = " + sum);

        sum = 0;
        int i = 0;
        while (i < N) sum += mass[i++];
        System.out.println("Sum = " + sum);

        i = 0; sum = 0;
        do {
            sum += mass[i++];
        } while(i < N);
        System.out.println("Sum = " + sum);
    }
}







