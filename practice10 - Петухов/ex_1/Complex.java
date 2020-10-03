package com.company;

public class Complex {
    private float x, y;

    public Complex(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Complex(){
        x = 0; y = 0;
    }

    @Override
    public String toString() {
        return "z = " + x + " + i* " + y;
    }
}
