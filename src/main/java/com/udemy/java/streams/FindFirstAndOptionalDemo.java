package com.udemy.java.streams;

import java.util.List;
import java.util.Optional;

public class FindFirstAndOptionalDemo {
    public static void main(String[] args) {
        List<String> listOfString =
                List.of("Apple","Orange","Watermelon","Banana","ball","cat");
        Optional<String> firstElement = listOfString
                .stream()
                .filter(str -> str.length() > 4)
                .findAny();
        firstElement.ifPresentOrElse(System.out::println, () -> System.out.println("No element Present"));

    }
}
