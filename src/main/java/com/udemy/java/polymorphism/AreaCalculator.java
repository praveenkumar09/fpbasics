package com.udemy.java.polymorphism;

public class AreaCalculator {
   public int calcArea(int side) {
       return side * side;
   }
    public double calcArea(double side) {
        return side * side;
    }

    public int calcArea(int length, int breadth) {
        return length * breadth;
    }
}
