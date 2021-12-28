package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {

        // Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Life");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("Lamp");
        arrayList.add("Purple");
        arrayList.add("Love");
        // This operation might change the size of the original list, it is not a good idea to use a loop without Iterator.

        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);

        }

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String word= iterator.next();
            if(word.toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(arrayList);


    }
}
