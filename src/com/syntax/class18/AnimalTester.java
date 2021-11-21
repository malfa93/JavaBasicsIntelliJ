package com.syntax.class18;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.name="Boby";
        dog.bark();
        dog.eat();

        cat.name="texy";
        cat.meow();

        System.out.println(dog.name);
    }
}
