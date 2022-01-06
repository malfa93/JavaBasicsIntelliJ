package com.syntax.review12;

import java.util.Collections;
import java.util.LinkedHashMap;

import static com.syntax.utils.MapUtils.sortByValue;

public class MapsDemo2 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedhashmap = new LinkedHashMap<>(); //Thread Safe

        linkedhashmap.put("Mohammed", 28);
        linkedhashmap.put("Deena", 20);
        linkedhashmap.put("Arwa", 25);
        linkedhashmap.put("Taima", 17);
        linkedhashmap.put("Fadhel", 59);

        LinkedHashMap<String, Integer> stringIntegerLinkedHashMap = sortByValue(linkedhashmap);
        System.out.println(stringIntegerLinkedHashMap);

    }


}
