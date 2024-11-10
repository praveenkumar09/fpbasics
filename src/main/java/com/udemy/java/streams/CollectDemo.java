package com.udemy.java.streams;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors.*;

import static java.util.stream.Collectors.*;

public class CollectDemo {
    public static void main(String[] args) {

        System.out.println("Before :: "+ LocalDateTime.now());
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Praveen","Male","Malaysia",true));
        personList.add(new Person("Swetha","Female","Malaysia",false));
        personList.add(new Person("Neela","Female","Malaysia",true));
        personList.add(new Person("Manu","Male","USA",true));
        personList.add(new Person("Shabu","Female","USA",false));
        personList.add(new Person("Sebastin","Male","India",true));
        personList.add(new Person("Jenny","Female","India",false));

        performSearch(personList,(person) -> !person.getName().toLowerCase().contains("z"));
        System.out.println("Before :: "+ LocalDateTime.now());
    }

    private static void performSearch(List<Person> personList, Predicate<Person> filterPredicate) {
        boolean isSelected = personList
                .stream()
                .filter(filterPredicate)
                .peek((person) -> person.setSelected(true))
                .noneMatch((person) -> !person.isSelected());
        System.out.println(isSelected);
        if(isSelected) {
            // List to MAP
            Map<String, String> personMap = personList
                    .stream()
                    .filter(filterPredicate)
                    .peek((person) -> {
                        String name = person.getName().toUpperCase();
                        person.setName(name);
                    })
                    .collect(toMap(Person::getName, Person::getGender));
            System.out.println(personMap);
            //List to Set
            Set<String> setPerson = personList
                    .stream()
                    .filter(filterPredicate)
                    .peek((person) -> {
                        String name = person.getName().toUpperCase();
                        person.setName(name);
                    })
                    .map(Person::getName)
                    .collect(toSet());
            System.out.println(setPerson);
            //List join
            String joinedString = personList
                    .stream()
                    .filter(filterPredicate)
                    .map(Person::getName)
                    .collect(joining(" "));
            System.out.println(joinedString);
            // List group
            //Map<String, List<Person>> groupByGender =
            TreeMap<String, TreeMap<String, Set<String>>> groupByGender = personList
                    .stream()
                    .collect(
                            groupingBy(Person::getGender,
                                    TreeMap::new,
                                    groupingBy(
                                            Person::getCountry,
                                            TreeMap::new,
                                            mapping(Person::getName, toSet())
                                    )
                            ));
            System.out.println(groupByGender);
        }
    }
}
