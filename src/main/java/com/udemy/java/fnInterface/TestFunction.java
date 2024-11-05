package com.udemy.java.fnInterface;

import java.math.BigDecimal;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        Function<String, Integer> fnStrLength = String::length;
        Function<Integer,Integer> fnSquare = x -> x * x;
        Function<Integer,Integer> fnPlusTwo = (b) -> b + 2;

        System.out.println(fnStrLength
                .andThen(fnSquare)
                .apply("hi hello how are you"));

        System.out.println(fnPlusTwo
                        .compose(fnSquare)
                        .apply(8));
    }
}
