package com.udemy.java.fnInterface;

import java.util.*;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> (x > 2 && x < 10);
        System.out.println(predicate.test(5));
        System.out.println(predicate.negate().test(1));
        System.out.println(predicate.test(3));
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(12));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        Predicate<Integer> lessThanThree = (i) -> i < 3;
        Predicate<Integer> greaterThanEight = (i) -> i > 8;
        set.removeIf(lessThanThree.or(greaterThanEight));
        System.out.println(set);

        List<String> nameList = new ArrayList<>();
        nameList.add("Praveen");
        nameList.add("Sathish");
        nameList.add("Manu");
        nameList.add("Sebastin");
        nameList.add("Arun");
        nameList.add("Senba");

        Predicate<String> checkGotS = (s) -> s.contains("S");
        nameList.removeIf(checkGotS);
        System.out.println(nameList);

    }
}
