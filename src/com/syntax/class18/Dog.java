package com.syntax.class18;

public class Dog extends Animal {

    boolean loyal=true;

    void printAllinfo(){

        System.out.println(name+breed+color+age+weight);
    }

    void bark(){

        System.out.println(name+" barking");

    }
}
