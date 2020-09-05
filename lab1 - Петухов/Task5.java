package com.company;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {
        if (fact(5) == 120) System.out.println("Test passed");
        else System.out.println("Test failed");
    }

    static long fact(int x){
        long f = 1;
        for (int i = 1; i <= x; i++) f *= i;
        return f;
    }
}







