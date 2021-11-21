package com.syntax.class20;

public class MethodOverloading2 {

    static void add(int ... arr){      // can handle any numbers of parameters, but has low prioraity compared to other methods.

        int sum=0;
        for(int number:arr){

            sum=sum+number;
        }
        System.out.println(sum);


    }


//    static void add(double num1, int num2){
//
//        System.out.println(num1+num2);
//    }

//    static void add(double num1, float num2){
//
//        System.out.println(num1+num2);
//    }

//    static void add(int num1, double num2){
//
//        System.out.println(num1+num2);
//    }
//
//    static void  add(double num1, double num2){
//
//        System.out.println(num1+num2);
//    }

   /* static void add(int[] array){
        int sum=0;

        for(int number:array){
            sum=sum+number;
        }

        System.out.println(sum);

    }*/


}
