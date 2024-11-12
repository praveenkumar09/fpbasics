package com.udemy.java.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SumOfNumbersDemo {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        Collections.addAll(listOfIntegers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // best option : to convert it to primitive type and then sum
        int sum = listOfIntegers
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        // next option : to use reduce function
        Optional<Integer> sumByReduce = listOfIntegers
                .stream()
                .reduce(Integer::sum);
        sumByReduce
                .ifPresentOrElse(System.out::println,() -> System.out.println("0"));


    }
}
