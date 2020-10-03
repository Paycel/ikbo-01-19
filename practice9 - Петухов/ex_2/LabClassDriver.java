package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class LabClassDriver implements LabClassUI {
    ArrayList<Student> students;

    public LabClassDriver() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void sortBySurname() {
        students.sort(Comparator.comparing(Student::getSurname));
    }

    @Override
    public void sortByGPA() {
        students.sort(new SortingStudentsByGPA());
    }

    @Override
    public Student findByFIO(String name, String surname, String patronymic) throws StudentNotFoundException {
        for (Student student: students)
            if (name.equals(student.getName())
            && surname.equals(student.getSurname())
            && patronymic.equals(student.getPatronymic()))
                return student;
        throw new StudentNotFoundException(name + " " + surname + " " + patronymic);
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }

    @Override
    public void printAll() {
        for (Student student: students)
            System.out.println(student);
        System.out.println("-----------------------------------------");
    }
}
