package com.company;

public class TestAuthor {
    public static void startTest() {
        final String name = "Alex";
        final String email = "TestEmail@mail.ru";
        final char gender = 'M';
        Author person = new Author(name, email, gender);
        System.out.println(person);
    }
}
