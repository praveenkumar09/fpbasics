package com.udemy.java.lambda;

public class TestLambda {
    public static void main(String[] args) {
        GreetingService greetService = (String greet,String name) -> greet +
                " " +
                name;

        System.out.println(greetService.greet("Hello","Praveen"));

    }
}
