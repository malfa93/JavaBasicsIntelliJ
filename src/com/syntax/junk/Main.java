package com.syntax.junk;


class Main {

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;


    Main(String make, String model, int numberOfDoors, int topSpeed, double price){

        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }

    Main(String make, String model,int topSpeed, double price){

        this.make=make;
        this.model=model;
        numberOfDoors= 4;
        this.topSpeed=topSpeed;
        this.price=price;

    }

    Main(int numberOfDoors, int topSpeed, double price){



        make="unknown";
        model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;

    }

    Main(String make, String model, int numberOfDoors){

        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        topSpeed= 90;
        price= 0.0;

    }

    void printInfo(){

        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);

    }



}

class Cars{

    public static void main(String[] args){

        new Main("Toyota", "Prius", 4, 120, 30000.0).printInfo();
        new Main("Toyota", "Prius",120, 30000.0).printInfo();
        new Main(4, 120, 30000.0).printInfo();
        new Main("Toyota", "Prius", 4).printInfo();




    }

}
