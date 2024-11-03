package com.udemy.java.lambda;


@FunctionalInterface
public interface GreetingService {
    public String greet(String greet, String name);
    public default void hi(){
        System.out.println("Hi Default");
    }
}
