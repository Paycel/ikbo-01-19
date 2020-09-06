package com.company;

public class FurnitureTest {
    public static void main(String[] args){
        FurnitureShop shop = new FurnitureShop(
                new Chair[]{new Chair(100, "leather", "with back")},
                new Sofa[]{new Sofa(120, "cloth", 20)},
                new Table[]{new Table(200, "Wood", 7)}
        );
        shop.showFurniture();
        Chair chair = new Chair(777, "leather", "with back");
        System.out.println(chair.getType());
    }
}
