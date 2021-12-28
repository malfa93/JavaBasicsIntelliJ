package com.syntax.class25.collectionframework;

import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {

        String[] names={"Moe", "Deena"};

        ArrayList<String> listOfNames = new ArrayList<>();
        System.out.println("Size of ListOfNames is "+listOfNames.size());
        listOfNames.add("Moe");
        listOfNames.add("Arwa");
        listOfNames.add("Deena");
        System.out.println("Size of ListOfNames is "+listOfNames.size());
        listOfNames.remove("Arwa");
        System.out.println("Size of ListOfNames is "+listOfNames.size());


    }


}
