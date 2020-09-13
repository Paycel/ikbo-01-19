package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sol(n, 0,true));
    }

    public static int sol(int n, int sum, boolean flag){
        int result = 0;
        if (n == 0) return 0;
        else if (!flag && n > 0) {
            if (n / 10 == 0) return sum + n % 10;
            return sum + sol(n / 10, n % 10, false);
        }
        result += sol(n / 10, n % 10, false);
        return result;
    }
}
