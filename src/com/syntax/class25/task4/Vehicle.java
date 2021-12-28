package com.syntax.class25.task4;

public class Vehicle {

    //Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
    // which should be returning a price of the car.
    //Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of
    // calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned price
    // car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    // if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount




    double vehiclePrice;
    String color;

    public Vehicle(double carPrice, String color) {
        this.vehiclePrice = vehiclePrice;
        this.color = color;
    }

    double calculateSalePrice(){

        return vehiclePrice;

    }
}

class Sedan extends Vehicle{

    double length;
    public Sedan(double carPrice, String color) {
        super(carPrice, color);
    }

    @Override
    double calculateSalePrice() {

        if(length>20){
            return vehiclePrice*0.95;
        } else
            return vehiclePrice*0.9;
    }
}

class Truck extends Vehicle{

    double weight;

    public Truck(double carPrice, String color) {
        super(carPrice, color);
    }


    @Override
    double calculateSalePrice() {

//        if(weight>2000){
//            return vehiclePrice*0.9;
//        } else {
//            return vehiclePrice*0.8;
//        }

        return weight > 2000 ? vehiclePrice * 0.9 : vehiclePrice * 0.8;

    }
}
