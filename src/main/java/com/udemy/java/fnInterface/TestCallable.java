package com.udemy.java.fnInterface;

import java.util.concurrent.Callable;

public class TestCallable {
    public static void main(String[] args) throws Exception {
        Callable<Double> callable = Math::random;
        System.out.println(callable.call());
    }
}
