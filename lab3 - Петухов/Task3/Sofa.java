package com.company;

public class Sofa extends Furniture {
    private int weight;

    public Sofa(int price, String material, int weight) {
        super(price, material);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "It's sofa with weight: " + weight + ", " + super.toString();
    }
}
