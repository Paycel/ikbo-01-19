package com.company;

public class Dachshund extends Dog {
    private int length;

    public Dachshund(int height, int weight, String name, int length) {
        super(height, weight, name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println("Dachshund is moving");
    }

    @Override
    public String toString() {
        return "This is dachshund, length: " + length + ", " + super.toString();
    }
}
