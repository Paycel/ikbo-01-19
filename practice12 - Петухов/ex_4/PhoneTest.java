package com.company;

public class PhoneTest {
    public static void main(String[] args) throws Exception {
        for (String phone: new String[]{
                "+79261234567", "89261234567", "+7779261234567", "+104289652211"})
            System.out.println(new Phone(phone));
    }
}
