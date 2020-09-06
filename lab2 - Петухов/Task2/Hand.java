package com.company;

public class Hand {
    private int length;

    public Hand(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Length of hand: " + length;
    }
}
