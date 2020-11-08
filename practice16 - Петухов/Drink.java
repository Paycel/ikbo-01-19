package com.company;

public class Drink implements Item{
    private int price;
    private String name, desc;

    public Drink(String name, String desc) {
        if (name.isEmpty() || desc.isEmpty()) throw new IllegalArgumentException("Illegal arguments for drink");
        this.name = name;
        this.desc = desc;
        this.price = 0;
    }

    public Drink(int price, String name, String desc) {
        if (price < 0 || name.isEmpty() || desc.isEmpty()) throw new IllegalArgumentException("Illegal arguments for drink");
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
        return "Drink{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
