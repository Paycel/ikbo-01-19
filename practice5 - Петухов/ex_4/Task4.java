package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int k = scanner.nextInt();
        final int s = scanner.nextInt();
        System.out.println(sol(k, s, 0, 0));
    }

    public static int sol(int k, int s, int sum, int length){
        if (length == k){
            if (sum == s) return 1;
            else return 0;
        }
        int startDigit = (length == 0 ? 1 : 0);
        int answer = 0;
        for (int i = startDigit; i < 10; i++)
            answer += sol(k, s, sum + i, length + 1);
        return answer;
    }
}
