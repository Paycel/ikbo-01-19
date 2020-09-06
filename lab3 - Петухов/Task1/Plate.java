package com.company;

public class Plate extends Dish{
    private int radius;

    public Plate(int price, int weight, int radius) {
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
        System.out.println("It's skillet, " + super.toString() + ", radius: " + radius);
    }
}
