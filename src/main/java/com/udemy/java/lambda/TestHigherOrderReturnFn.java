package com.udemy.java.lambda;

public class TestHigherOrderReturnFn {
    public static void main(String[] args) {
        System.out.println("Starting execution");
        testFn(getCaseFn("upperCase"));
        testFn(getCaseFn("lowerCase"));
        System.out.println("Ending execution");
    }

    private static GreetingService getCaseFn(String switchCase) {
        switch (switchCase) {
            case "upperCase":
                return (g, n) -> {
                    System.out.println("Inside lambda");
                    return g.toUpperCase() + " " + n.toUpperCase();
                };
            case "lowerCase":
                return (g, n) -> {
                    System.out.println("Inside lambda");
                    return g.toLowerCase() + " " + n.toLowerCase();
                };
            default:
                throw new IllegalArgumentException("Illegal Argument");
        }
    }

    public static void testFn(GreetingService svc) {
        System.out.println("Inside greet method");
        System.out.println(svc.greet("Hello", "World"));
    }
}
