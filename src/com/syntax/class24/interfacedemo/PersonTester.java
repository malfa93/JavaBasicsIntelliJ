package com.syntax.class24.interfacedemo;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new SDETInstructor();
        person.eat();
        person.sleep();
//        person.teach(); can not call these because it is not stored in Person interface.
//        person.work();


        Employee employee = new SDETInstructor();
        employee.work();

        SyntaxEmployees syntaxEmployees = new SDETInstructor();
        syntaxEmployees.teach();
        syntaxEmployees.eat();
        syntaxEmployees.work();
        syntaxEmployees.sleep();

        SDETInstructor sdetInstructor = new SDETInstructor();
        sdetInstructor.teach();
        sdetInstructor.eat();
        sdetInstructor.work();
        sdetInstructor.sleep();
    }
}
