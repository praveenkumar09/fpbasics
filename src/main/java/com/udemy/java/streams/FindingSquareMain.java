package com.udemy.java.streams;

import java.util.HashSet;
import java.util.Set;

public class FindingSquareMain {
    private static final Set<Integer> numbersSet = new HashSet<>();

    public static void main(String[] args) {
        numbersSet.add(1);
        numbersSet.add(2);
        numbersSet.add(3);
        numbersSet.add(4);
        numbersSet.add(5);
        numbersSet.add(6);
        numbersSet.add(7);
        numbersSet.add(8);
        numbersSet.add(9);

        /*for(Integer number : numbersSet) {
            if(number % 2 ==0)
                System.out.println("the number is :"+number * number);
            else
                System.out.println("the number is :"+number);
        }*/

        //Streams
        numbersSet
                .stream()
                .filter(i -> {
                    System.out.println("Filter received: " + i);
                    return i % 2 == 0;
                })
                .limit(3)
                .map(i -> {
                    System.out.println("Map received: " + i);
                    return i * i;
                })
                .forEach(System.out::println);
    }
}
