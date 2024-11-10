package com.udemy.java.streams;

import java.util.List;

public class NoneMatchTerminalOpDemo {
    public static void main(String[] args) {
        List<String> listOfString =
                List.of("Apple","Orange","Watermelon","Banana","ball","cat");
        boolean result = listOfString
                .stream()
                .filter(str -> str.length() > 4)
                .noneMatch(str -> str.length() > 20);
        System.out.println(result);

    }
}
