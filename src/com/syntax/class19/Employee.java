package com.syntax.class19;

public class Employee {


    String name;
    int age;
    int Salary =30000;
    int baseNoDaysOff=20;



    void printSalary(){

        System.out.println(Salary);
    }

    void printNoDaysOff(){

        System.out.println(baseNoDaysOff);
    }

}


class Manager extends Employee{

    int Salary=5000;
    int bonus=10;
    int travlingAllowance=200;
    void printSalary(){

        super.printSalary();
        System.out.println(bonus+travlingAllowance+super.Salary);
    }
}