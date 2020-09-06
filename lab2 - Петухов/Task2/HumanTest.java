package com.company;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(
                new Head("Blue", "Black"),
                new Leg(90),
                new Hand(70),
                "Alesha", 190, 80, 23
        );
        System.out.println(human);
        System.out.println(human.getHead().toString());
        System.out.println(human.getHand().toString());
        System.out.println(human.getLeg().toString());
        human.setAge(777);
        human.setHead(new Head("Green", "White"));
        System.out.println(human);
        System.out.println(human.getHead().toString());
    }
}
