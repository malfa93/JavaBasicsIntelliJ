package com.syntax.review12;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MapsDemo {

    public static void main(String[] args) {


        Hashtable<String, Integer> hashtable = new Hashtable<>(); //Thread Safe

        hashtable.put("Mohammed", 28);
        hashtable.put("Deena", 20);
        hashtable.put("Arwa", 25);
        hashtable.put("Taima", 17);
        hashtable.put("Fadhel", 59);

        System.out.println(hashtable);

        Set<String> keys = hashtable.keySet();
        //Iterator<String> iterator = keys.iterator();

//        keys.removeIf(x->x.length()==5); // Remove names that have 5 characters.
//        System.out.println(hashtable);

//
//        hashtable.values().removeIf(x->x>20);
//        System.out.println(hashtable);

        hashtable.entrySet().removeIf(entry->entry.getKey().endsWith("a")&&entry.getValue()>19);

        System.out.println(hashtable);

    }
}
