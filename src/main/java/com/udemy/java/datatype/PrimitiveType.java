package com.udemy.java.datatype;

public class PrimitiveType {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("i = " + i);
        change(i);
        System.out.println("i = " + i);
    }

    private static void change(int i) {
        i++;
    }
}
