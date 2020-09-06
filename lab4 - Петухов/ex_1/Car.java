package com.company;

public class Car implements Nameable{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "This is car: " + name;
    }
}
