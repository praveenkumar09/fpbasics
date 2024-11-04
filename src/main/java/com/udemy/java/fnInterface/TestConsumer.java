package com.udemy.java.fnInterface;

import java.util.*;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {

        String configMap = "dbLog";

        List<String> list = new ArrayList<>();
        list.add("Praveen");
        list.add("Kumar");

        Consumer<String> dbConsumer = (str) -> System.out.println("I am writing into DB: " + str);

        Consumer<String> loggingConsumer = (str) -> System.out.println("I am logging into log file: " + str);

        Consumer<String> dbLogConsumer = dbConsumer.andThen(loggingConsumer);

        Map<String, Consumer<String>> map = new HashMap<>();
        map.put("db", dbConsumer);
        map.put("logging", loggingConsumer);
        map.put("dbLog", dbLogConsumer);

        list.forEach(map.get(configMap));
    }
}
