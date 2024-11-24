package com.udemy.java9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class takeWhile {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        //** take-while example **//
        list.stream()
                .sorted(Comparator.reverseOrder())
                .takeWhile(num -> num > 5)
                .limit(3)
                .forEach(System.out::println);
        //** drop-while example **//
        System.out.println("/** Drop while from here **/");
        list.stream()
                .sorted(Comparator.reverseOrder())
                .dropWhile(num -> num > 5)
                .forEach(System.out::println);

    }
}
