package com.company;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book("Arthur K.D", "White fire", 1777, 451);
        System.out.println(book);
        book.setPages(666);
        book.setYear(1778);
        System.out.println(book);
    }
}
