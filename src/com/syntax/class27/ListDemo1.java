package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        List<String> students2 = new LinkedList<String>();

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Mercedes");
        cars.add(1,"Toyota"); // Will be added at index number 1.
        System.out.println(cars);


        Iterator<String> iterator=cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Even when you do a while loop aain, you will only get the result once, becase once an Iterator is used, you
        // can not use it again. You will need to reinitialize the itrator again: Iterator<String> iterator=cars.iterator();

    }
}
