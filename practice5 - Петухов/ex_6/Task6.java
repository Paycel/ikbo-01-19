package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sol(n, 2));
    }

    public static String sol(long n, long del){
        if (n == 2) return "YES";
        if (n % del == 0 || !checkFerma(n)) return "NO";
        if (del <= Math.sqrt((double)n) && n % del != 0)
            return sol(n, del + 1);
        else
            return "YES";
    }

    public static boolean checkFerma(long n) {
        for (int i = 0; i < 100; i++) {
            long a = (int) (Math.random() * (n - 2) + 2);
            if (gcd(a, n) != 1 || BigInteger.valueOf((long) Math.pow(a, n - 1)).mod(BigInteger.valueOf(n)).equals(1))
                return false;
        }
        return true;
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
