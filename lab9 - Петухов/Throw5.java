package com.company;

public class Throw5 {
    public static void main(String[] args) {
        printMessage("123");
        printMessage(null);
    }

    public static void printMessage(String key) {
        String message = "";
        try {
            message = getDetails(key);
        } catch (NullPointerException e){
            System.out.println("NULL");
        }
        System.out.println(message);
    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}
