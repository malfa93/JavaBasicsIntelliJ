package com.syntax.class20.methodoverriding;

public class Parent {

    String name = "Fadhel";

    void printName(){
        System.out.println("Name is "+name);
    }

    void getMarried(){
        System.out.println("Moe will get married by my choice");
    }
}

class Child extends Parent{

    String name ="Deena";

    void printName(){

        String name = "Arwa";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    @Override
    void getMarried(){
        System.out.println("But I like someone else");
    }

    void letsDoSomethingCrazy(){
        super.getMarried();
        getMarried();
    }


    public static void main(String[] args) {
        Child child = new Child();
        child.letsDoSomethingCrazy();
        child.printName();
        child.getMarried();
}




    }