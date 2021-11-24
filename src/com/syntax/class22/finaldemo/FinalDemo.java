package com.syntax.class22.finaldemo;

class Parent{

    final double gravity;

    Parent(double gravity){

        this.gravity=gravity;
    }



    final void printGravityValue(){

        //gravity=10.2;       The value of gravity ca not be changed because it is final.

        System.out.println(gravity);
    }
}

class Child extends Parent{

    Child(double gravity){
        super(gravity);
    }

//    void printGravityValue(){
//
//
//    }


}

public class FinalDemo {
}
