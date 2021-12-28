package com.syntax.review11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        LinkedList <String> list1 = new LinkedList<>();


        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add(0, "Pepsi");
        drinks.add("Fanta");
        System.out.println(drinks);

        drinks.remove("Fanta");
        System.out.println(drinks.get(0));



        //drinks.add(5, "Pepsi");
        //if that index does not exist we will be getting an outOfBound Error.




    }
}
