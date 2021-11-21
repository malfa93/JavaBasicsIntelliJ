package com.syntax.class19;

public class Task1 {

    /*Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.

     */


    public static void main(String[] args) {
        B b =new B();
    }
}

class A{

     A(){

        System.out.println("A");
    }


}

class B extends A{

     B(){

        System.out.println("B");
    }


}

class C extends B{

     C(){

        System.out.println("C");
    }



}
