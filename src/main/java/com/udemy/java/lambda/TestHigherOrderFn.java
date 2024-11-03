package com.udemy.java.lambda;

public class TestHigherOrderFn {
    public static void main(String[] args) {
        System.out.println(test((g,n) -> g.toUpperCase()+" "+n.toUpperCase(), "Hello", "World"));
    }

    public static String test(GreetingService svc,String greet, String name){
        return svc.greet(greet,name);
    }
}
