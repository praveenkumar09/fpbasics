package com.udemy.java10;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class CollectorAPIChanges {
    public static void main(String[] args) {
        var list = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> modifiableList = list.stream()
                .filter(num -> num % 2 == 0)
                .collect(toList());
        modifiableList.add(10);
        // if we need an unmodifiable List after a process then
        List<Integer> unmodifiableList = list.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        //not possible
        //unmodifiableList.add(10);
    }
}
