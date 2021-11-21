package com.syntax.class20;

public class Task1 {

    static void area(double ... arr){

        double Asum=1;

        for(double num:arr){

            Asum*=num;
        }

        System.out.println(Asum);
    }
}
