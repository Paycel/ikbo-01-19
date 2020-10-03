package com.company;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String student){
        super("Student " + student + " not found");
    }
}
