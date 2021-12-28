package com.syntax.class29;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {

//        Create the collection that will store single uniques Objects of a String type in which order is preserved.
//        Write a logic to concatenate all string from the collection.

        Set<String> set = new LinkedHashSet<>();
        set.add("chair");
        set.add("sky");
        set.add("tree");
        set.add("sky");

        String values="";
        for (String str:set
             ) {
            values= values+str;

        }

        System.out.println(values);
    }
}
