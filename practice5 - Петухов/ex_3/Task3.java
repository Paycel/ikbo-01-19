package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        print(a, b);
    }
    static void print(int a, int b){
        if (a < b) {
            System.out.print(a + " ");
            print(a + 1, b);
        } else if (a > b) {
            System.out.print(a + " ");
            print(a - 1, b);
        } else {
            System.out.print(a);
            return;
        }
    }

}
