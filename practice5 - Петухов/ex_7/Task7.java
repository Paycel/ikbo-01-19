package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long n = scanner.nextInt();
        System.out.println(sol(n, 2, n));
    }

    public static ArrayList<Long> sol(long n, long del, long finalN) {
        ArrayList<Long> ans = new ArrayList<>();
        if (n == 1) return ans;
        if (n == 2 || n == 3) {
            ans.add(n);
            return ans;
        }
        if (del <= finalN / 2) {
            while (n % del != 0) del++;
            ans.add(del);
            ans.addAll(sol(n / del, del, finalN));
        }
        return ans;
    }
}
