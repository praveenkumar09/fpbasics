package com.udemy.java.fnInterface;

import com.udemy.java.predicate.RulesEngine;
import com.udemy.java.streams.FindingSquareLazinessDemoMain;

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
        FindingSquareLazinessDemoMain.createSet(set);

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
        nameList.add("");

        RulesEngine.get()
                .forEach(nameList::removeIf);
        System.out.println(nameList);

    }
}
