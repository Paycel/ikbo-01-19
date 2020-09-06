package com.company;

public abstract class Furniture {
    private int price;
    private String material;

    public Furniture(int price, String material) {
        this.price = price;
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "price: " + price + ", material: " + material;
    }
}
