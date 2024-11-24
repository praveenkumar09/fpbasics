package com.udemy.java11;

import java.util.List;
import java.util.Optional;

public class OptionalIsEmptyDemo {
    public static void main(String[] args) {
        var list = List.of(1,2,3,4,5,6,7,8,9);

        Optional<Integer> firstElement = list.stream()
                .filter(e -> e < 5)
                .findFirst();
        System.out.println(firstElement.isEmpty());
    }
}
