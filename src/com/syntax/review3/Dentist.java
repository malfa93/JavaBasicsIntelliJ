package com.syntax.review3;

import com.syntax.review2.Doctor;

public class Dentist extends Doctor {

    String certificate;
    String office;


    public Dentist(String name, String lastName, String speciality){
        super(name, lastName, speciality);


    }

    public Dentist(String name, String lastName, String speciality, String certificate, String office){
        super(name, lastName, speciality);
        this.certificate=certificate;
        this.office=office;


    }

    public void haveCertificate(){
        System.out.println(name+" has a dentist certificate");
    }

    public static void main(String[] args) {


        Dentist doe = new Dentist("Jack","Doe", "Dentist");


        doe.printInfo();
        doe.haveCertificate();

    }


}
