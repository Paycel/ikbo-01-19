package com.company;

public class Student{
    private int gpa;
    private String name, surname, patronymic;

    public Student(int gpa, String name, String surname, String patronymic) throws EmptyStringException {
        if (name.isEmpty() || surname.isEmpty() || patronymic.isEmpty()) throw new EmptyStringException();
        this.gpa = gpa;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getGpa() {
        return gpa;
    }
}
