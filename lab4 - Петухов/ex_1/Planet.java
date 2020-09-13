package com.company;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "This is planet: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
