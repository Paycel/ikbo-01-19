package com.company;

public class MovableTest {
    public static void startTest(){
        MovablePoint point = new MovablePoint( 0, 0, 15, 15);
        MovableCircle circle = new MovableCircle(20, point);
        for (int i = 0; i < 10; i++) {
            switch ((int) (Math.random() * 100) % 4){
                case 0: circle.moveUp(); break;
                case 1: circle.moveDown(); break;
                case 2: circle.moveLeft(); break;
                case 3: circle.moveRight(); break;
            }
        }
    }
}
