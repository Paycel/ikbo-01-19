package com.company;

public class DishTest {
    public static void main(String[] args){
        Dish dish = new Saucepan(100, 400, 20);
        System.out.println(dish);
        Saucepan saucepan = (Saucepan) dish;
        saucepan.showInfo();
        saucepan.setRadius(3);
        saucepan.showInfo();
        Skillet skillet = new Skillet(10, 40, 2);
        skillet.showInfo();
        System.out.println(skillet.getRadius());
    }
}
