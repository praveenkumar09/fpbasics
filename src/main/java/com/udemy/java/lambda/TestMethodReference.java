package com.udemy.java.lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestMethodReference {
    private static final List<String> nameList = new ArrayList<String>();
    public static void main(String[] args) {
        StringOperations stringOp = String::toUpperCase;
        System.out.println(stringOp.operate("Hello World"));
        StringOperations stringOp2 = String::toLowerCase;
        System.out.println(stringOp2.operate("Hello World"));

        //************** END *******************************//
        StringConcat concatStr = String::concat;
        String resultConcat = concatStr.append("Hello","World");
        System.out.println("resultConcat = " + resultConcat);
        //************** END *******************************//

        StringAppendOperation appendStr = nameList::add;
        appendStr.add("Praveen");
        appendStr.add("Neela");
        appendStr.add("Swetha");
        System.out.println(nameList);



    }
}
