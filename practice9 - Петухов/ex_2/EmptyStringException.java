package com.company;

public class EmptyStringException extends Exception {
    public EmptyStringException(){
        super("Entered empty data about student");
    }
}
