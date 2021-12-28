package com.syntax.class27;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Life");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("Lamp");
        arrayList.add("Purple");
        arrayList.add("Love");
        // remove e from words

        for (int i = 0; i < arrayList.size(); i++) {
            String str = arrayList.get(i);
            if(str.toLowerCase().endsWith("e")){
                arrayList.set(i,str.substring(0,str.length()-1)); // set() is used to replace an element at a specific index.
            }
        }
        System.out.println(arrayList);
    }
}
