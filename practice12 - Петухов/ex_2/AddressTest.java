package com.company;

public class AddressTest {
    public static void main(String[] args) {
        new Address("Страна, регион, город, улица, дом, корпус, квартира");
        new Address("Страна- регион- город- улица- дом- корпус- квартира");
        new Address("Страна; регион; город; улица; дом; корпус; квартира");
    }
}
