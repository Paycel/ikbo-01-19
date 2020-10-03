package com.company;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("Magic chair???");
    }

    @Override
    public void sit() {
        System.out.println("Sit at magic chair");
    }
}
