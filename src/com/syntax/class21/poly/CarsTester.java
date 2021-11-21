package com.syntax.class21.poly;

public class CarsTester {

    public static void main(String[] args) {

//        BMW bmw = new BMW();
//        bmw.start();
//        bmw.park();
//        bmw.stop();
//
//        Tesla tesla = new Tesla();
//        tesla.start();
//        tesla.park();
//        tesla.stop();
//
//        Toyota toyota = new Toyota();
//        toyota.start();
//        toyota.park();
//        toyota.stop();



        Cars[] cars = {new BMW(), new Tesla(), new Toyota()};

        for(Cars car:cars){

            car.park();
            car.stop();
            car.start();
        }



    }

}
