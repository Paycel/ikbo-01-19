package com.company;

public interface LabClassUI {
    void sortBySurname();
    void sortByGPA();
    Student findByFIO(String name, String surname, String patronymic) throws StudentNotFoundException;
    void add(Student student);
    void printAll();
}
