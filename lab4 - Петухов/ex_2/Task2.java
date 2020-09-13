package com.company;

public class Task2 {

    public static void main(String[]args){
        Car car = new Car(200);
        PC pc = new PC(777);
        Laptop laptop = new Laptop(1482);
        System.out.println(car.getPrice());
        System.out.println(pc.getPrice());
        System.out.println(laptop.getPrice());
    }

}
