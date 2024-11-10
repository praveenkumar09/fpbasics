package com.udemy.java.streams;

import java.util.stream.Stream;

public class StringStreamDemo {
    public static void main(String[] args) {
        String a  = "Ball";
        String b = "Delta";
        String c = "Apple";

        Stream.of(a, b, c)
                .filter(str -> str.length() > 4)
                .forEach(System.out::println);
    }
}
