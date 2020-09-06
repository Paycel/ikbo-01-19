package com.company;

public class Chair extends Furniture{
    private String type;

    public Chair(int price, String material, String type) {
        super(price, material);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "It's chair type: " + type + ", " + super.toString();
    }
}
