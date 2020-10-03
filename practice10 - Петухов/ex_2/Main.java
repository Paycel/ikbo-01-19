package com.company;

public class Main {

    public static void main(String[] args){
        ChairFactory factory = new ChairFactory();
        Client client = new Client();

        client.sit(factory.createFunctionalChair());
        client.sit(factory.createMagicChair());
        client.sit(factory.createVictorianChair());
        client.setChair(factory.createVictorianChair());

        VictorianChair victorianChair = (VictorianChair) client.chair;
        System.out.println(victorianChair.getAge());

        client.setChair(factory.createFunctionalChair());
        FunctionalChair functionalChair = (FunctionalChair) client.chair;
        System.out.println(functionalChair.sum(2 , 3));

        client.setChair(factory.createMagicChair());
        MagicChair magicChair = (MagicChair) client.chair;
        magicChair.doMagic();
    }
}
