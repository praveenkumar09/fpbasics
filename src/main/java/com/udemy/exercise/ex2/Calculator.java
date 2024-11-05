package com.udemy.exercise.ex2;

import com.udemy.exercise.ex1.MathOperation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private static final Map<String, MathOperation> mapOfOperations =
            new HashMap<>() ;

    static{
        mapOfOperations.put("+",(a,b) -> a + b);
        mapOfOperations.put("-",(a,b) -> a - b);
        mapOfOperations.put("*",(a,b) -> a * b);
        mapOfOperations.put("/",(a,b) -> a / b);
    }

    public static int calculate(String expression) {
        String[] tokens = expression.split(" ");
        int onScreenNumber = Integer.parseInt(tokens[0]);

        for(int i = 1; i < tokens.length; i = i+2){
            MathOperation mathOperation = mapOfOperations.get(tokens[i]);
            int  enteredNumber = Integer.parseInt(tokens[i+1]);
            onScreenNumber = calculate(onScreenNumber,mathOperation,enteredNumber);
        }

        return onScreenNumber;
    }

    public static void main(String[] args) {
        String expression = "5 + 6 - 8 ^ 2";
        addOperation("^", (a, b) -> (int) Math.pow(a, b));
        int result = calculate(expression);
        System.out.println(result);
    }

    private static int calculate(int onscreenNumber, MathOperation operation, int enteredNumber){
        return operation.operate(onscreenNumber,enteredNumber);
    }

    private static void addOperation(String operation, MathOperation operationToAdd){
        mapOfOperations.put(operation, operationToAdd);
    }
}
