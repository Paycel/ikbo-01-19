package com.company;

public class Task1 {

    public static void main(String[]args){
        Car car = new Car("car_name");
        Planet planet = new Planet("planet_name");
        Animal animal = new Animal("animal_name");
        System.out.println(car.getName());
        System.out.println(planet.getName());
        System.out.println(animal.getName());
    }

}
