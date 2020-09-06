package com.company;

public class FurnitureShop {
    private Chair[] chairs;
    private Sofa[] sofas;
    private Table[] tables;

    public FurnitureShop(Chair[] chairs, Sofa[] sofas, Table[] tables) {
        this.chairs = chairs;
        this.sofas = sofas;
        this.tables = tables;
    }

    void showFurniture(){
        for (Chair chair: chairs) System.out.println(chair);
        for (Sofa sofa: sofas) System.out.println(sofa);
        for (Table table: tables) System.out.println(table);
    }
}
