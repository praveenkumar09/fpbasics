package com.udemy.exercise.ex3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class ReadNames {
    public static void main(String[] args) throws IOException {
        List<String> firstNameList = Files.readAllLines(Path.of("/Users/praveenkumarthangaraj/Documents/fp/module/basics/fpbasics/src/main/java/com/udemy/exercise/ex3/first-names.txt"));
        //** ex-1 solution **//
        long countOfNamesStartsWithB = firstNameList.parallelStream().filter(name -> name.startsWith("B")).count();
        System.out.println(countOfNamesStartsWithB);
        //** ex-2 solution **//
        ArrayList<String> nameListFromC = firstNameList.parallelStream().filter(name -> name.startsWith("C") && name.contains("s")).collect(toCollection(ArrayList::new));
        System.out.println(nameListFromC);
        //* ex-3 solution **//
        long countOfChars = firstNameList
                .parallelStream()
                .filter(name -> name.startsWith("M"))
                .flatMap((name) -> name.chars().boxed()
                )
                .count();
        System.out.println(countOfChars);
        //** ex-3 other solution **//
        long countOfCharsWithMap = firstNameList
                .parallelStream()
                .filter(name -> name.startsWith("M"))
                .map(String::chars)
                .flatMap(IntStream::boxed)
                .count();
        System.out.println(countOfCharsWithMap);
        //** ex-4 solution**//
        ConcurrentMap<String, Long> collectResult = firstNameList
                .parallelStream()
                .map(names -> names.charAt(0))
                .collect(groupingByConcurrent(
                        String::valueOf,
                        counting()
                ));
        System.out.println(collectResult);
        //** ex-5 solution
        List<String> ex5List = firstNameList
                .parallelStream()
                .filter(name -> name.contains("-"))
                .map(name -> name.replace("-", " "))
                .toList();
        System.out.println(ex5List.size());
        //** ex-6 solution **/
        firstNameList
                .parallelStream()
                .max(Comparator.comparingInt(String::length))
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Error"));


    }
}
