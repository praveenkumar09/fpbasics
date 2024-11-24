package com.udemy.java11;

public class stripExample {
    public static void main(String[] args) {
        String str =" udemy ";
        System.out.println(str.trim());
        // trim doesnt include unicode character, strip does
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());

    }
}
