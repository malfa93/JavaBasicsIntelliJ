package com.syntax.class26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {


    public static void main(String[] args) {

        LinkedList<String> subjects1=new LinkedList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");
        subjects1.add("TestNg");

        System.out.println(subjects1);
        subjects1.set(2, "Python");
        System.out.println(subjects1);



    }
}
