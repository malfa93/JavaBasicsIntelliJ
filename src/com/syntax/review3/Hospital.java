package com.syntax.review3;

import com.syntax.review2.Doctor;

public class Hospital {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Moe", "Alfa","EMT", 10000);

        System.out.println(d1.name);
        System.out.println(d1.lastName);
    }
}
