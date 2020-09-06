package com.company;

public abstract class Dish {
    private int price;
    private int weight;

    public Dish() {
    }

    public Dish(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    abstract void showInfo();

    @Override
    public String toString() {
        return "price: " + price + ", weight: " + weight;
    }
}
