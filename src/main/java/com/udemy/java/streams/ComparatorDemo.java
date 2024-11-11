package com.udemy.java.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ComparatorDemo {
    public static void main(String[] args) {
        String a  = "Ball";
        String b = "Delta";
        String c = "Apple";
        Optional<Stream<String>> smallestOptionalString = getSmallestString(a,b,c);
        smallestOptionalString
                .ifPresentOrElse(s -> s.forEach(System.out::println),
                        () -> System.out.println("No data found"));

        Student pravStudent = new Student("Praveen","Kumar",10,11);
        Student pravStudent1 = new Student("Prav","Kumar",10,12);
        Student manuStudent = new Student("Manu","Kumar",12,10);
        Student praveenStudent = new Student("Praveen","Thangaraj",11,12);
        List<Student> studentList = new ArrayList<>(List.of(pravStudent,manuStudent,praveenStudent,pravStudent1));
        // sort by firstName and lastname from the object level
        studentList
                .stream()
                .sorted(Comparator.reverseOrder())
                        .forEach(System.out::println);
        // sort by student score
        System.out.println("============== END =====================");
        studentList
                .stream()
                .sorted(Comparator.comparing(Student::getScore))
                .forEach(System.out::println);
        // sort by student score and student height
        System.out.println("============== END =====================");
        studentList
                .stream()
                .sorted(Comparator.comparing(Student::getScore)
                        .thenComparing(Student::getHeight))
                .forEach(System.out::println);
    }

    private static Optional<Stream<String>> getSmallestString(String a, String b, String c) {
        Stream<String> stream = Stream.of(a,b,c);
        return Optional.ofNullable(stream
                .sorted(Comparator.reverseOrder()));
    }
}
