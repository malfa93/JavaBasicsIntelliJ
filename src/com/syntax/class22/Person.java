package com.syntax.class22;

public class Person {

    String name;
    Person(String name){

        this.name=name;
    }

    void eat(){
        System.out.println(name+" Person eating");
    }

    void performDailyTask(){
        System.out.println("Eat sleep repeat");
    }


}

class Employee extends Person{

    Employee(String name){
        super(name);
    }

    void performDailyTask(){
        System.out.println("Working all the day in the office and reading emails at night");
    }

}


class Student extends Person{

    Student(String name){
        super(name);
    }

    void performDailyTask(){

        System.out.println("Attending the classes at day reading at night");
    }

}

class Teacher extends Person{

    Teacher(String name){
        super(name);
    }

    void performDailyTask(){
        System.out.println("Giving homework");

    }

    void designClasses(){

        System.out.println("Create repls and design new classes");
    }


}


