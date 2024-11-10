package com.udemy.java.streams;

import java.util.ArrayList;
import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(1,2,3,4));
        List<Integer> b = new ArrayList<>(List.of(5,6,7));
        List<Integer> c = new ArrayList<>(List.of(8,9,0));

        List<List<Integer>> listOfIntegers = List.of(a,b,c);

        listOfIntegers
                .stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}