package com.company;

public class ShapeTest {
    public static void startTest() {
        Circle circle = new Circle(20, "Blue", true);
        System.out.println(circle + "\nArea: " + circle.getArea() + "\nPerimeter: " + circle.getPerimeter());
        Rectangle rectangle = new Rectangle(20, 30, "Red", false);
        System.out.println(rectangle + "\nArea: " + rectangle.getArea() + "\nPerimeter: " + rectangle.getPerimeter());
        Square square = new Square(40, "Green", true);
        System.out.println(square + "\nArea: " + square.getArea() + "\nPerimeter: " + square.getPerimeter());
    }
}
