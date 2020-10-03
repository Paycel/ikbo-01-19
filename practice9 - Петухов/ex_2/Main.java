package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        LabClassUI classUI = new LabClass().getClassUI();
        classUI.add(new Student(3, "Alexey", "Au", "Alexeevich"));
        classUI.add(new Student(2, "Vadim", "Bh", "Vadimovich"));
        classUI.add(new Student(100, "Sta$", "Cudj", "Alexeevich"));
        classUI.printAll();
        classUI.sortByGPA();
        classUI.printAll();
        classUI.sortBySurname();
        classUI.printAll();
 //       classUI.findByFIO("none", "none", "none"); // exception
 //       classUI.add(new Student(100, "", "Cudj", "Alexeevich")); // exception
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Surname: ");
        String surname = scanner.nextLine();
        System.out.println("Patronymic: ");
        String patronymic = scanner.nextLine();
        classUI.findByFIO(name, surname, patronymic);
    }
}
