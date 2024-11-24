package com.udemy.java10;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TypeInferenceWithVar {
    public static void main(String[] args) {
        var number =10;
        var list = List.of(1,2,3,4,5,6,7,8,9);
        var stringIntegerMap = Map.of("name1", 12,
                "name2", 12,
                "name3", 12,
                "name4", 12);
        System.out.println(number);
        //var a; not possible
        //var a = "praveen" is possible
        test(4,5);


    }

    public static void test(int a, int b){
        //cannot use var here in lambda functions
        BiConsumer<Integer,Integer> doubleIt = (x,y) -> System.out.println(x*y);
        doubleIt.accept(a,b);
    }
}
