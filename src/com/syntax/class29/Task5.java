package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
//        Create a map of Best Buy store. Place
//        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//        Retrieve all keys and values from a Best Buy map using EntrySet.


        Map<Integer, String> items = new HashMap<>();
        items.put(7664847, "Printer");
        items.put(7879885, "TV");
        items.put(7879889, "HoverBoard");
        items.put(7879895, "Monitor");
        items.put(7879985, "Shredder");
        items.put(7879785, "HP Laptop");
        Set<Map.Entry<Integer, String>> itemSet = items.entrySet();
        Iterator<Integer> iterator = items.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key);
        }
        Iterator<String> iterator2 = items.values().iterator();
        while (iterator2.hasNext()) {
            String value = iterator2.next();
            System.out.println(value);
        }
    }
}
