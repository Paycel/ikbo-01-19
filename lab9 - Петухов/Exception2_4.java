package com.company;

import java.util.Scanner;

public class Exception2_4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch (NumberFormatException | ArithmeticException e){
            System.out.println("Not correct number (float/string) or attempted division by zero");
        } finally {
            System.out.println("Well, hello");
        }
    }
}
