package com.company;

public class Tester {
    public Tester() {
    }

    static void startTest() {
        String dogName = "Шарик";
        String bookName = "Книга";
        String ballName = "Мяч";
        Dog dog = new Dog("Шарик");
        Book book = new Book("Книга");
        Ball ball = new Ball();
        if (dog.toString().equals("Шарик") && book.toString().equals("Книга") && ball.toString().equals("Мяч")) {
            System.out.println("Test success");
        } else {
            System.out.println("Test failed");
        }

    }
}
