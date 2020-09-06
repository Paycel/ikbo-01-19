package com.company;

public class Shepherd extends Dog {
    private String commands;

    public Shepherd(int height, int weight, String name, String commands) {
        super(height, weight, name);
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public void move() {
        System.out.println("Shepherd is moving");
    }

    @Override
    public String toString() {
        return "This is shepherd, commands: " + commands + ", " + super.toString();
    }
}
