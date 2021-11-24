package com.syntax.class22.task1;

public class Student {

    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
     Define common behavior within parent class and override some of the methods in child classes
     Define some methods specific to child classes
     Write example of achieving run time polymorphism
    */


    String name;


    void study(){
        System.out.println("Students must study");
    }

    void doHomework(){
        System.out.println("Students must do homework");
    }

    void practice(){
        System.out.println("Students must practice");
    }


}


class SyntaxStudent extends Student{
    @Override
    void study(){

        System.out.println("Syntax Student must study 25 hours a week");
    }
    @Override
    void doHomework(){
        System.out.println("Syntax Students must solve repls");
    }

    void doResearch(){
        System.out.println("Syntax student do additional research");
    }
}

class CollegeStudents extends Student{


    @Override
    void doHomework() {
        System.out.println("College student must do homework");
    }
}




