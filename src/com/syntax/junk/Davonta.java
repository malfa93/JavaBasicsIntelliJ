package com.syntax.junk;

import java.util.Scanner;

public class Davonta {
    public static void main(String[] args) {

        System.out.println("Hello D");
        System.out.println("Please give me two numbers to add");

        int a, b, c;

        Scanner scan = new Scanner(System.in);

        a=scan.nextInt();
        b=scan.nextInt();

        c=a+b;

        System.out.println("The sum of the two number is:");
        System.out.println(c);


    }
}
