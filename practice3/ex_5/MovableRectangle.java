package com.company;

public class MovableRectangle implements Movable{

    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
        this.topLeft = topLeft;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
        System.out.println(this.toString());
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
        System.out.println(this.toString());
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
        System.out.println(this.toString());
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
        System.out.println(this.toString());
    }

    public boolean isOkay(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public String toString() {
        return "Top Left Point:\n" + topLeft.toString() + "\nBottom Right Point:\n" + bottomRight.toString();
    }
}
