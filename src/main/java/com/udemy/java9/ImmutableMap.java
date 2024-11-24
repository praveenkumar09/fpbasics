package com.udemy.java9;

import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "a", 10,
                "b", 15,
                "c", 20
        );
        //map.put("d",25); cannot be done
        System.out.println(map);
    }
}
