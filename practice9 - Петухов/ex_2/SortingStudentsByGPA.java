package com.company;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return t1.getGpa() - student.getGpa();
    }
}
