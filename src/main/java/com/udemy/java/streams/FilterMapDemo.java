package com.udemy.java.streams;

import java.util.HashSet;
import java.util.Set;

public class FilterMapDemo {
    private static final Set<Integer> numbersSet = new HashSet<>();

    public static void main(String[] args) {
        createSet(numbersSet);

        //Streams
        System.out.println("Starting Stream...");
        // Stream is lazy so with no terminal operator the stream is not executed
        streamDemo();
        System.out.println("Ending Stream...");
    }

    static void streamDemo() {
        // check for even numbers
        // ensure that number > 5
        // find square and add 2 to that
        // print on console one by one
        FilterMapDemo.numbersSet
                .stream()
                .filter(number -> (number % 2 == 0 && number > 5))
                .map(number -> (number * number) + 2)
                .forEach(System.out::println);
    }

    public static void createSet(Set<Integer> numbersSet) {
        numbersSet.add(1);
        numbersSet.add(2);
        numbersSet.add(3);
        numbersSet.add(4);
        numbersSet.add(5);
        numbersSet.add(6);
        numbersSet.add(7);
        numbersSet.add(8);
        numbersSet.add(9);
        numbersSet.add(10);
    }
}
