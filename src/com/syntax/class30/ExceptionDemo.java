package com.syntax.class30;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Important line of code");
        System.out.println("Important line of code");
        System.out.println("Important line of code");
        System.out.println("Important line of code");
        try{
            System.out.println(10/0);
        }catch(Exception e){
            //e.printStackTrace();
            System.out.println("Dividing by zero not possible in java");
        }

        System.out.println("Important line of code");
        System.out.println("Important line of code");

    }
}
