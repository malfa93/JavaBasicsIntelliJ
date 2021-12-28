package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Orange());
        for(Fruit f:fruits){
            f.printName();
        }


//        Fruit[] fruits1 = {new Orange(), new Apple()};   // this is faster but you won't have access to ArrayList Methods
//        for(Fruit f1:fruits1){
//            f1.printName();
//        }


    }


}

class Fruit{
 void printName(){
     System.out.println("I am a fruit");
 }

}

class Apple extends Fruit{

    @Override
    void printName() {
        System.out.println("I am an Apple");
    }
}

class Orange extends Fruit{

    @Override
    void printName() {
        System.out.println("I am an Orange");
    }

}
