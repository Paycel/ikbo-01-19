package com.company;

public class ShapeTest {
    public static void startTest() {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //fixme System.out.println(s1.getRadius());
        // Не заработает по причине отсутствия реализации метода в суперклассе Shape
        // Абстрактные методы отрабатываются, потому что имеется реализация в соответствующем классе Circle

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        /*
        Объект приобрёл возможность использовать методы своего "родного"(Circle) класса благодаря
        спуску по иерархии с суперкласса до "родного", всё отрабатывается корректно
         */

        //fixme Shape s2 = new Shape();
        // Объект абстрактного класса невозможно создать по причине создания абстрактного класса как суперкласса для потомков
        // со сходными чертами

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //fixme System.out.println(s3.getLength());
        // Причина абсолютно та же, что и в 11 строчке кода

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        /*
        Объект приобрёл возможность использовать методы своего "родного"(Rectangle) класса благодаря
        спуску по иерархии с суперкласса до "родного", всё отрабатывается корректно
         */

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //fixme System.out.println(s4.getSide());
        // См. 11 строчку кода

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());
        //fixme
        // По своей сути причина точно такая же, как и в 11 строчке:
        // Класс-родитель(rectangle) не знает о методах класса-наследника(square)

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
        /*
        Объект приобрёл возможность использовать методы своего "родного"(Shape) класса благодаря
        спуску по иерархии с класса-родителя до "родного", всё отрабатывается корректно
         */
    }
}
