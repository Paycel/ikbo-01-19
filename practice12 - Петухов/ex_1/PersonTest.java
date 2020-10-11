package com.company;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("name", "fam", "ot");
        Person nullPerson = new Person("", "FAM", null);
        System.out.println(person.getFIO());
        System.out.println(nullPerson.getFIO());
    }
}
