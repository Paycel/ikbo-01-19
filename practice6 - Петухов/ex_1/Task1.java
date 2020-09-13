package com.company;

public class Task1 {
    public static void main(String[] args){
        Student[] iDNumber = new Student[7];
        for (int i = 0; i < iDNumber.length; i++){
            iDNumber[i] = new Student((int) (Math.random() * 100));
            System.out.print(iDNumber[i] + " ");
        }
        System.out.println();
        for (int j = 1; j < iDNumber.length; j++){
            Student key = iDNumber[j];
            int i = j - 1;
            while (i >= 0 && iDNumber[i].compareTo(key) > 0){
                iDNumber[i + 1] = iDNumber[i];
                i -= 1;
            }
            iDNumber[i + 1] = key;
        }
        for (Student student: iDNumber) System.out.print(student + " ");
    }
}
