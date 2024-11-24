package com.udemy.java11;

public class linesExample {
    public static void main(String[] args) {
        String str = """ 
                Hai,
                How are you?
                Wishing you happy new year!
                """;
        str.lines()
                .forEach(System.out::println);
    }
}
