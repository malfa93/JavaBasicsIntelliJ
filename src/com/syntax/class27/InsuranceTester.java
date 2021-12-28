package com.syntax.class27;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {

        ArrayList<Insurance> insuranceArrayList = new ArrayList<>();
//        Car car = new Car("Geico","Tesla S");
//        Pet pet = new Pet("Farmers","Dog");
//        Health health = new Health("State Farm");

        insuranceArrayList.add(new Car("Geico","Tesla S"));
        insuranceArrayList.add(new Pet("Farmers","Dog"));
        insuranceArrayList.add(new Health("State Farm"));

        for (Insurance in:insuranceArrayList
             ) {
            in.getQuote();
            in.cancelInsurance();

        }
    }
}
