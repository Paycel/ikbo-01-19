package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ConcreteFactory factory = new ConcreteFactory();
        System.out.println(factory.createComplex());
        System.out.println(factory.createComplex(1, 2));
    }
}
