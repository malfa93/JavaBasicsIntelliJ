package com.syntax.class20;

public class Task4 {
    /*Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.*/


    private void method(){

        System.out.println("void method");
    }

    private int method(int num){
        System.out.println("int method");
        return num;
    }

    private int method(String str){

        System.out.println("str method");

        return 5;
    }

    public static void main(String[] args) {



        Task4 t4 = new Task4();

        t4.method();
        t4.method(10);
        t4.method("Hello");


    }





}
