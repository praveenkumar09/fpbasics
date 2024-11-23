package com.udemy.exercise.ex3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class ReadNames {
    public static void main(String[] args) throws IOException {
        List<String> firstNameList = Files.readAllLines(Path.of("/Users/praveenkumarthangaraj/Documents/fp/module/basics/fpbasics/src/main/java/com/udemy/exercise/ex3/first-names.txt"));
        //** ex-1 solution **//
        long countOfNamesStartsWithB = firstNameList
                .parallelStream()
                .filter(name -> name.startsWith("B"))
                .count();
        System.out.println(countOfNamesStartsWithB);
        //** ex-2 solution **//
        ArrayList<String> nameListFromC = firstNameList
                .parallelStream()
                .filter(name -> name.startsWith("C") &&
                        name.contains("s"))
                .collect(toCollection(
                        ArrayList::new
                ));
        System.out.println(nameListFromC);
    }
}
