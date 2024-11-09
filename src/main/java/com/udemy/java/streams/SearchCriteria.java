package com.udemy.java.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class SearchCriteria {
    public static final Map<String, Predicate<Person>> searchRules = new HashMap<>();
    static {
        searchRules.put("byMale",person -> person.getGender().equalsIgnoreCase("Male"));
        searchRules.put("byFemale",person -> person.getGender().equalsIgnoreCase("Female"));
        searchRules.put("byCountry",person -> person.getCountry().equalsIgnoreCase("Malaysia"));
        searchRules.put("bySelected",person -> person.isSelected() == Boolean.TRUE);
        searchRules.put("byNotSelected",person -> person.isSelected() == Boolean.FALSE);
    }
}
