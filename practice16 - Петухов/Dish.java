package com.company;

public class Dish implements Item{
    private int price;
    private String name, desc;

    public Dish(String name, String desc) {
        if (name.isEmpty() || desc.isEmpty()) throw new IllegalArgumentException("Illegal arguments for dish");
        this.name = name;
        this.desc = desc;
        this.price = 0;
    }

    public Dish(int price, String name, String desc) {
        if (price < 0 || name.isEmpty() || desc.isEmpty()) throw new IllegalArgumentException("Illegal arguments for dish");
        this.price = price;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
