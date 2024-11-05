package com.udemy.java.fnInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class TestBiConsumer {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Praveen",33);
        map.put("Manu",32);
        map.put("Sebastin",34);

        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Hello", "World");

        BiConsumer<String, Integer> biConsumerMap = (k,v) -> {
            System.out.println("k=" + k + " v=" + v);
        };

        map.forEach(biConsumerMap);

    }
}
