package com.company;

public abstract class Dog {
    private int height, weight;
    private String name;

    public Dog(int height, int weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public abstract void move();

    @Override
    public String toString() {
        return "name: " + name + ", height: " + height + ", weight: " + weight;
    }
}
