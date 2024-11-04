package com.udemy.java.fnInterface;

import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<String> random = () -> "This " +
                "string " +
                "came " +
                "from " +
                "supplier.";
        System.out.println(random.get());
    }
}
