package com.udemy.java.datatype;

import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args) {
        int[] i = {1,2,3};
        System.out.println("i = " + Arrays.toString(i));
        changeReferenceValue(i);
        System.out.println("i = " + Arrays.toString(i));

    }

    private static void changeReferenceValue(int[] i) {
        i[0]++;
        i[1]++;
        i[2]++;
    }
}
