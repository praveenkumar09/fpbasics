package com.udemy.java.polymorphism;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        test(dog);
        Cat cat = new Cat();
        test(cat);
        Horse horse = new Horse();
        test(horse);
    }

    private static void test(Animal animal){
        animal.makeSound();
        animal.eat();
    }
}
