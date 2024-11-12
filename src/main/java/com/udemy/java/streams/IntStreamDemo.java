package com.udemy.java.streams;

import java.util.*;
import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        Collections.addAll(listOfIntegers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalDouble average = listOfIntegers
                .stream()
                .mapToInt(a -> a)
                .average();
        System.out.println(average.getAsDouble());

        IntStream.range(1,10).forEach(a -> System.out.println(a));


    }
}
