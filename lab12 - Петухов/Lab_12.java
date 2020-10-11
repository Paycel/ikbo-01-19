package com.company;

import java.util.regex.Pattern;

public class Lab_12 {
    private static final String regex = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/(19[0-9]{2}|[2-9][\\d]{3})";

    public static void main(String[] args) {
        for (String date: new String[]{"12/05/2007", "65/02/2011", "12/12/1995", "12/12/9999"})
            System.out.println(date + ": " + Pattern.compile(regex).matcher(date).matches());
    }
}
