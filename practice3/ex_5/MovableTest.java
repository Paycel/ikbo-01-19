package com.company;

public class MovableTest {
    public static void startTest(){
        MovablePoint topLeft = new MovablePoint( 0, 10, 15, 15);
        MovablePoint bottomRight = new MovablePoint(10, 0, 15, 15);
        MovableRectangle movableRectangle = new MovableRectangle(topLeft, bottomRight);
        if (movableRectangle.isOkay())
        for (int i = 0; i < 10; i++) {
            System.out.println("Move #" + (i + 1));
            switch ((int) (Math.random() * 100) % 4){
                case 0: movableRectangle.moveUp(); break;
                case 1: movableRectangle.moveDown(); break;
                case 2: movableRectangle.moveLeft(); break;
                case 3: movableRectangle.moveRight(); break;
            }
        }
        else
            System.out.println("Points at rectangle aren't okay");
    }
}
