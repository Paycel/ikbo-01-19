package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidINNException {
        Shop shop = new Shop();
        shop.request("12345");
        shop.request("1");
    }
}
