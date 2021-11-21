package com.syntax.class21;

public class MethodOverloadingDemo {

    //GET FROM GITHUB!!!!

    void method(int number){
        System.out.println(number);
    }

    void method(String name){
        System.out.println(10);
        System.out.println("Hello");
        System.out.println("Java");

    }

    void method(int num, String name){
        System.out.println(20);
        System.out.println("Hello");
        System.out.println("Java");
    }

    public static void main(String[] args) {
        MethodOverloadingDemo md = new MethodOverloadingDemo();

        md.method(10);
        md.method("Moe");
        md.method(19, "Deena");
    }
}
