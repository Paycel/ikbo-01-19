package com.company;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {
        center.moveUp();
        System.out.println(center.toString());
    }

    @Override
    public void moveDown() {
        center.moveDown();
        System.out.println(center.toString());
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
        System.out.println(center.toString());
    }

    @Override
    public void moveRight() {
        center.moveRight();
        System.out.println(center.toString());
    }

    @Override
    public String toString() {
        return center.toString() + ", radius: " + radius;
    }
}
