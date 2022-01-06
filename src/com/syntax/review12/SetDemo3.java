package com.syntax.review12;

import java.util.LinkedHashSet;

public class SetDemo3 {
    public static void main(String[] args) {

        LinkedHashSet<Person> persons = new LinkedHashSet<>();
        persons.add(new Person("Mohammed", 28));
        persons.add(new Person("Deena", 20));
        persons.add(new Person("Arwa", 25));
        persons.add(new Person("Taima", 17));

        System.out.println(persons);

        persons.remove(new Person("Mohammed", 28)); // in the Persons class, use the equals method. minute 45 of video (ReviewClass 15)
        System.out.println(persons);

        persons.removeIf(p->p.age>23);
        System.out.println(persons);

        System.out.println("*********");

        persons.forEach(p-> System.out.println(p)); //Prints all the elements one by one

    }
}
