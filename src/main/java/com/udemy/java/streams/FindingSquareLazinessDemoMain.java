package com.udemy.java.streams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class FindingSquareLazinessDemoMain {
    private static final Set<Integer> numbersSet = new HashSet<>();

    public static void main(String[] args) {
        createSet(numbersSet);

        //Streams
        System.out.println("Starting Stream...");
        // Stream is lazy so with no terminal operator the stream is not executed
        streamDemo(numbersSet);
        System.out.println("Ending Stream...");
    }

    static void streamDemo(Set<Integer> numbersSet) {
        numbersSet
                .stream()
                .filter(i -> {
                    System.out.println("Filter received: " + i);
                    return i % 2 == 0;
                })
                .skip(2)
                .limit(3)
                .distinct()
                .peek(i -> System.out.println("Distinct received: " + i))
                .map(i -> {
                    System.out.println("Map received: " + i);
                    return i * i;
                })
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    public static void createSet(Set<Integer> numbersSet) {
        numbersSet.add(1);
        numbersSet.add(2);
        numbersSet.add(2);
        numbersSet.add(2);
        numbersSet.add(3);
        numbersSet.add(4);
        numbersSet.add(5);
        numbersSet.add(6);
        numbersSet.add(6);
        numbersSet.add(7);
        numbersSet.add(8);
        numbersSet.add(8);
        numbersSet.add(9);
        numbersSet.add(10);
    }
}
