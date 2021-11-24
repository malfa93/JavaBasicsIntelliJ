package com.syntax.class22;

public class PersonTester {
    public static void main(String[] args) {


        Person person = new Teacher("Ashgar");
        person.eat();

        Person[] persons ={new Student("Moe"), new Employee("Naiya"), new Teacher("Ashgar")};

        for (Person person2:persons){

            person2.performDailyTask();

            if(person2 instanceof Teacher){

                ((Teacher)person2).designClasses();
            }

        }
    }
}
