package com.company;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        Student[] students1 = new Student[7];
        for (int i = 0; i < students1.length; i++){
            students1[i] = new Student((int) (Math.random() * 100));
            System.out.print(students1[i] + " ");
        }
        System.out.println();
        Student[] students2 = new Student[7];
        for (int i = 0; i < students2.length; i++){
            students2[i] = new Student((int) (Math.random() * 100));
            System.out.print(students2[i] + " ");
        }
        System.out.println();
        for (Student student: mergeSort(students1, students2)) System.out.print(student + " ");
    }

    public static Student[] mergeSort(Student[] array) {
        return merge(Arrays.copyOf(array, array.length), new Student[array.length], 0, array.length);
    }

    public static Student[] mergeSort(Student[] array1, Student[] array2) {
        Student[] array = new Student[array1.length + array2.length];
        System.arraycopy(array1, 0, array, 0, array1.length);
        System.arraycopy(array2, 0, array, array1.length, array1.length);
        return merge(array, new Student[array.length], 0, array.length);
    }

    public static Student[] merge(Student[] buff1, Student[] buff2, int start, int end) {
        if (start >= end - 1) return buff1;
        int middle = start + (end - start) / 2;
        Student[] sorted1 = merge(buff1, buff2, start, middle);
        Student[] sorted2 = merge(buff1, buff2, middle, end);
        int index1 = start;
        int index2 = middle;
        int destIndex = start;
        Student[] result = sorted1 == buff1 ? buff2 : buff1;
        while (index1 < middle && index2 < end)
            result[destIndex++] = sorted1[index1].compareTo(sorted2[index2]) > 0 ? sorted1[index1++] : sorted2[index2++];
        while (index1 < middle) result[destIndex++] = sorted1[index1++];
        while (index2 < end) result[destIndex++] = sorted2[index2++];
        return result;
    }
}
