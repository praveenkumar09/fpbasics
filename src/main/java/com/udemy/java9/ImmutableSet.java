package com.udemy.java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class ImmutableSet {
    public static void main(String[] args) {
        Set<String> strings = Set.of("a", "b", "c");
        //set.add("0") cannot be done in an immutable set
        System.out.println(strings);
    }
}
