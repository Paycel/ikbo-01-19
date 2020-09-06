package com.company;

public class DogTest {
    public static void main(String[] args){
        Shepherd shepherd = new Shepherd(50, 10, "Rex", "Sit, bark, lie down");
        Dachshund dachshund = new Dachshund(20, 5, "Boo", 60);
        shepherd.move();
        dachshund.move();
        System.out.println(shepherd);
        System.out.println(dachshund);
        shepherd.setCommands("Sit");
        dachshund.setLength(70);
        System.out.println(shepherd);
        System.out.println(dachshund);
    }
}
