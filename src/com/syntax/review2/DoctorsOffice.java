package com.syntax.review2;

public class DoctorsOffice {

    public static void main(String[] args) {

        Doctor dc = new Doctor("John", "Doe", "Eye Doc", 9000);

        System.out.println(dc.name);
        System.out.println(dc.lastName);
        System.out.println(dc.speciality);
        System.out.println(dc.salary);

    }
}
