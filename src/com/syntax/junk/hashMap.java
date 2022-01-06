package com.syntax.junk;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);

        // Checking for the key_element '20'
        System.out.println("Is the key '20' present? " +
                hash_map.containsKey(20));

        // Checking for the key_element '5'
        System.out.println("Is the key '5' present? " +
                hash_map.containsKey(5));


        System.out.println("************");


        Map<Integer, String> map
                = new HashMap<Integer, String>();

        map.put(12345, "student 1");
        map.put(22345, "student 2");
        map.put(323456, "student 3");
        map.put(32496, "student 4");
        map.put(32446, "student 5");
        map.put(32456, "student 6");

        System.out.println(map.values());
    }
}
