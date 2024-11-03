package com.udemy.exercise.ex1;

public class TestMathOperation {
    public static void main(String[] args) {

        int resultAdd = calculate(5,operationFn("add"),2);
        System.out.println("ResultAdd :"+resultAdd);
        //************** END *******************************//

        int resultSub = calculate(resultAdd,operationFn("subtract"),3);
        System.out.println("ResultSub :"+resultSub);
        //************** END *******************************//

        int resultMultiply = calculate(resultSub,operationFn("multiply"),7);
        System.out.println("ResultMultiply :"+resultMultiply);
        //************** END *******************************//

        int resultAdd2 = calculate(resultMultiply,operationFn("add"),2);
        System.out.println("ResultAdd2 :"+resultAdd2);

        //************** END *******************************//

        int resultDivide = calculate(resultAdd2,operationFn("divide"),3);
        System.out.println("ResultDivide :"+resultDivide);
        //************** END *******************************//

    }

    private static MathOperation operationFn(String operation){
        switch (operation){
            case "add":
                return Integer::sum;
            case "subtract":
                return (a, b) -> a - b;
            case "multiply":
                return (a, b) -> a * b;
            case "divide":
                return (a, b) -> a / b;
            default:
                throw new IllegalArgumentException("Operation not defined");
        }
    }

    private static int calculate(int onscreenNumber, MathOperation operation, int enteredNumber){
        return operation.operate(onscreenNumber,enteredNumber);
    }
}
