package com.company;

public class Saucepan extends Dish {
    private int radius;

    public Saucepan(int price, int weight, int radius) {
        super(price, weight);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    void showInfo() {
        System.out.println("It's saucepan, " + super.toString() + ", radius: " + radius);
    }
}
