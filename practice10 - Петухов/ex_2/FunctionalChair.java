package com.company;

public class FunctionalChair implements Chair{
    public int sum(int a, int b){
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Sit at functional chair");
    }
}
