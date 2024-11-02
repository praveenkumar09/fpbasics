package com.udemy.java.polymorphism;

public class TestArea {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        int area = areaCalculator.calcArea(4);
        double doubleArea = areaCalculator.calcArea(4.25);
        int rectangleArea = areaCalculator.calcArea(5,4);
        System.out.println(area);
        System.out.println(doubleArea);
        System.out.println(rectangleArea);
    }
}
