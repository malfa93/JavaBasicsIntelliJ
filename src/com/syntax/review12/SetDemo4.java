package com.syntax.review12;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SetDemo4 {
    public static void main(String[] args) {
        LinkedHashSet<Person> persons = new LinkedHashSet<>();
        persons.add(new Person("Mohammed", 28));
        persons.add(new Person("Deena", 20));
        persons.add(new Person("Arwa", 25));
        persons.add(new Person("Taima", 17));

        long s = persons.stream().filter(p -> p.name.contains("a")).count();
        System.out.println(s);

        List<String> collect = persons.stream().filter(p -> p.age < 22).map(p -> p.name).collect(Collectors.toList());

        System.out.println(collect);


    }
}
