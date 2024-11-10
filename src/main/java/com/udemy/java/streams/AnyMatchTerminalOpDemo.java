package com.udemy.java.streams;

import java.util.Comparator;
import java.util.List;

public class AnyMatchTerminalOpDemo {
    public static void main(String[] args) {
        List<String> listOfString =
                List.of("Apple","Orange","Watermelon","Banana","ball","cat");
        boolean result = listOfString
                .stream()
                .filter(str -> str.length() > 4)
                .anyMatch(str -> str.contains("e"));
        System.out.println(result);

    }
}
