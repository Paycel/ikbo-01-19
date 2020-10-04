package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Integer[] array = new Integer[10];
        for (int i = 0; i < 10; i++) array[i] = (int) (Math.random() * 10);
        ArrayList<Integer> list = (ArrayList<Integer>) convert(array);
        System.out.println(list);

        Saver<Integer> saver = new Saver<>(3);
        saver.add(1);
        saver.add(2);
        saver.add(3);
        saver.add(4);

        System.out.println(peek(array, 4));

        catalogReader(new File("out"));
    }

    private static <E> List<E> convert(E[] list){
        return new ArrayList<>(Arrays.asList(list));
    }

    private static <E> E peek(E[] list, int index){
        return list[index];
    }

    private static void catalogReader(File baseDirectory) {
        ArrayList<String> catalogs = new ArrayList<>();
        if (baseDirectory.isDirectory())
            for (File file : Objects.requireNonNull(baseDirectory.listFiles()))
                if (!file.isFile()) {
                    catalogs.add(file.getName());
                    catalogReader(file);
                }
        for (int i = 0; i < 5 && catalogs.size() > i; i++)
            System.out.println(catalogs.get(i));
    }
}
