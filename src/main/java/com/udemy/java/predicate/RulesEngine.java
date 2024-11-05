package com.udemy.java.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RulesEngine {

    private static final Predicate<String> isBlank = String::isEmpty;
    private static final Predicate<String> hasS = (_element) -> _element.contains("S");

    public static List<Predicate<String>> get(){
        List<Predicate<String>> predicates = new ArrayList<>();
        predicates.add(isBlank);
        predicates.add(hasS);
        return predicates;
    }

}
