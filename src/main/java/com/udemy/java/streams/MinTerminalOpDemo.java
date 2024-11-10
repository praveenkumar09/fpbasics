package com.udemy.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinTerminalOpDemo {
    public static void main(String[] args) {
        List<String> listOfString =
                List.of("Apple","Orange","Watermelon","Banana","ball","cat");
        listOfString
                .stream()
                .filter(str -> str.length() > 4)
                .min(Comparator.naturalOrder())
                .ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));

    }
}
