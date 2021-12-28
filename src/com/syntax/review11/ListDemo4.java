package com.syntax.review11;

import java.util.LinkedList;
import java.util.List;

public class ListDemo4 {
    public static void main(String[] args) {
        LinkedList<Integer> arrayList = new LinkedList<>();

        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(30);

        int counter = 0;

        for (Integer number :arrayList
             ) {
            if(number>3){
                counter++;
            }

        }
        System.out.println(counter);


        //Object[] objects = arrayList.stream().filter(x -> x > 3).count();
        System.out.println(arrayList.stream().filter(x -> x > 3).count()); // lambda expressions

        List<Integer> list = arrayList.subList(3, 5);
        System.out.println(list); // this is like the substring method, it shows the arrays from indexes 3 and 5

    }
}
