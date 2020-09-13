package com.company;

public class Student implements Comparable<Student>{
    private int id;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }

    @Override
    public String toString() {
        return "" + id;
    }
}
