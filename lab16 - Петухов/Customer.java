package com.company;

public class Customer{
    private String firstName, secondName;
    private int age;
    private Address address;
    private Customer MATURE_UNKNOWN_CUSTOMER, NOT_MATURE_UNKNOWN_CUSTOMER;


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
