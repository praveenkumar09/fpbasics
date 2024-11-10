package com.udemy.java.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {
    public static void main(String[] args) {
        String a  = "Ball";
        String b = "Delta";
        String c = "Apple";
        Optional<String> smallestOptionalString = getSmallestString(a,b,c);
        smallestOptionalString.ifPresent(System.out::println);
    }

    private static Optional<String> getSmallestString(String a, String b, String c) {
        Stream<String> stream = Stream.of(a,b,c);
        return stream
                .min(Comparator.comparing(String::length));
    }
}
