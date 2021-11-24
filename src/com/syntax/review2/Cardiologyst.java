package com.syntax.review2;

public class Cardiologyst extends Doctor{

    public Cardiologyst(String name, String lastName, String specialty){
        super(name, lastName, specialty);

    }

    public static void main(String[] args) {
        Cardiologyst smith = new Cardiologyst("John", "Smith", "EMT");

        smith.printInfo();
        smith.treatPatient("Jack");
        smith.work();
        smith.getClass();


    }



}
