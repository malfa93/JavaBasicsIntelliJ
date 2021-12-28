package com.syntax.junk;

public class FirstInterfaceTester implements FirstInterface, SecondInterface{

    @Override
    public void firstMethod() {
        System.out.println("First");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second");

    }

    public static void main(String[] args) {

        FirstInterfaceTester firstInterfaceTester = new FirstInterfaceTester();
        firstInterfaceTester.firstMethod();
        firstInterfaceTester.secondMethod();
    }
}
