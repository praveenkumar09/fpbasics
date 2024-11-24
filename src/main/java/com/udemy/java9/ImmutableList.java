package com.udemy.java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list = new ArrayList<>(listOfIntegers);
        System.out.println(listOfIntegers);
        Collections.copy(list, listOfIntegers);
        list.add(2);
        System.out.println(list);
    }
}
