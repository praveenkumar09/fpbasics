package com.udemy.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class ListExample{
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Praveen","Male","Malaysia",true));
        personList.add(new Person("Swetha","Female","Malaysia",false));
        personList.add(new Person("Neela","Female","Malaysia",true));
        personList.add(new Person("Manu","Male","USA",true));
        personList.add(new Person("Shabu","Female","USA",false));
        personList.add(new Person("Sebastin","Male","India",true));
        personList.add(new Person("Jenny","Female","India",false));

        SearchCriteria.searchRules
                .forEach((k,v) -> {
                    System.out.println(k + ": " + v);
                    performSearch(personList,v);
                });
    }

    private static void performSearch(List<Person> personList, Predicate<Person> filterPredicate) {
        personList
                .stream()
                .filter(filterPredicate)
                .forEach(System.out::println);
    }
}
