package com.udemy.java.lambda;

public class TestHigherOrderFn {
    public static void main(String[] args) {
        System.out.println("Starting execution");
        System.out.println(
                test((g,n) -> {
                    System.out.println("Inside lambda");
            return g.toUpperCase() + " " + n.toUpperCase();
        }
        , "Hello", "World"));
        System.out.println("Ending execution");
    }

    public static String test(GreetingService svc,String greet, String name){
        System.out.println("Inside greet method");
        return svc.greet(greet,name);
    }
}
