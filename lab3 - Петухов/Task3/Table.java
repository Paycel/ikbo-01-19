package com.company;

public class Table extends Furniture {
    private int diameter;

    public Table(int price, String material, int diameter) {
        super(price, material);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "It's table with diameter: " + diameter + ", " + super.toString();
    }
}
