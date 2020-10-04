package com.company;

import java.util.Scanner;

public class Throw8 {
    public void getKey(){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Key ");
        String key = "";
        while (key.equals(""))
            try {
                key = myScanner.nextLine();
                printDetails(key);
            } catch (Exception e){
                System.out.println("Empty string");
            }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
