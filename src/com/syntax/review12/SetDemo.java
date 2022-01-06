package com.syntax.review12;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {

        /*
        Hashset no duplicate and no insertion order
         */

        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(20); // duplicates are not allowed, so it will ignore.
        hashSet.add(30);

        System.out.println(hashSet);

        for (Integer number:hashSet
             ) {
            System.out.println(number);

        }

        //hashSet.remove(20);
        System.out.println(hashSet);


        hashSet.removeIf(number -> number > 10); // this is a lamda expression used instead of an iterator

//        Iterator<Integer> iterator = hashSet.iterator();
//
//        while(iterator.hasNext()){
//            Integer number = iterator.next();
//            if(number>10){
//                iterator.remove();
//            }


        System.out.print(hashSet);
        System.out.print("  ****");

        }


    }

