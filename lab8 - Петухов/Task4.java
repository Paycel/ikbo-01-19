package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your text:");
        final String text = scanner.nextLine();
        System.out.println("Write name of your .txt file:");
        final String path = scanner.nextLine() + ".txt";
        FileWriter writer = new FileWriter(path, true);
        writer.write(text);
        writer.close();
    }
}
