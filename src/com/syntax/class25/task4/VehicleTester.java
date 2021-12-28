package com.syntax.class25.task4;

public class VehicleTester {
    public static void main(String[] args) {

        Vehicle[] vehicle = {new Sedan(150, "Blue"), new Truck(23423,"green")};

        for(Vehicle car:vehicle){
            System.out.println(car.calculateSalePrice());
        }

    }
}
