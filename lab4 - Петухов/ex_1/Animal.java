package com.company;

public class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "This is animal: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
