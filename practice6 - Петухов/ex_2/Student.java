package com.company;

public class Student implements Comparable<Student>{
    private int gpa;

    public Student(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student student) {
        return this.gpa - student.gpa;
    }

    @Override
    public String toString() {
        return "" + gpa;
    }

    public int getGpa() {
        return gpa;
    }
}
