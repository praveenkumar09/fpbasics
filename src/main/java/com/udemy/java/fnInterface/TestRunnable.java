package com.udemy.java.fnInterface;

public class TestRunnable {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello world");
        };
        runnable.run();
    }
}
