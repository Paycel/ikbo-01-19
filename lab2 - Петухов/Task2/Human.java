package com.company;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    private String name;
    private int height, weight, age;

    public Human(Head head, Leg leg, Hand hand, String name, int height, int weight, int age) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight;
    }
}
