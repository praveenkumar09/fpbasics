package com.udemy.java.streams;

import java.util.HashSet;
import java.util.Set;

public class FindingSquareMain {
    private static final Set<Integer> numbersSet = new HashSet<>();

    public static void main(String[] args) {
        FindingSquareLazinessDemoMain.createSet(numbersSet);

        /*for(Integer number : numbersSet) {
            if(number % 2 ==0)
                System.out.println("the number is :"+number * number);
            else
                System.out.println("the number is :"+number);
        }*/

        //Streams
        FindingSquareLazinessDemoMain.streamDemo(numbersSet);
    }
}
