package com.company;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        Student[] students = new Student[7];
        for (int i = 0; i < students.length; i++){
            students[i] = new Student((int) (Math.random() * 100));
            System.out.print(students[i] + " ");
        }
        System.out.println();
        quickSort(students, 0, students.length - 1);
        for (Student student: students) System.out.print(student + " ");
        System.out.println();

        for (int i = 0; i < students.length; i++){
            students[i] = new Student((int) (Math.random() * 100));
            System.out.print(students[i] + " ");
        }
        System.out.println();
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        Arrays.sort(students, comparator);
        for (Student student: students) System.out.print(student + " ");
    }

    private static <T extends Comparable<T>> void quickSort(T[] array, int low, int high) {
        if (array.length == 0) return;
        if (low >= high) return;
        int middle = low + (high - low) / 2;
        T opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i].compareTo(opora) > 0) i++;
            while (array[j].compareTo(opora) < 0) j--;
            if (i <= j) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) quickSort(array, low, j);
        if (high > i) quickSort(array, i, high);
    }
}
