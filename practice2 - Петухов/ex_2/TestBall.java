package com.company;

public class TestBall {
    public static void startTest(){
        Ball nullBall = new Ball();
        Ball ball = new Ball(4, 2);
        System.out.println(nullBall + "\n" + ball + "\n---------");
        nullBall.setX(1);
        nullBall.setY(55);
        ball.setXY(5, 6);
        System.out.println(nullBall + "\n" + ball + "\n---------");
        nullBall.move(-1, +3.2);
        ball.move(3.1, 2);
        System.out.println(nullBall + "\n" + ball + "\n---------");
    }
}
