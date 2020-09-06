package com.company;

public class Car implements Priceable {
    private int price;

    public Car(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getPrice() {
        return "This is car price: " + price;
    }
}
