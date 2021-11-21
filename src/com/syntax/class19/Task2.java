package com.syntax.class19;

public class Task2 {

    /*Write program to inherit class A that has method
    print F which is static and call or reuse that method into class B
     */

    public static void main(String[] args) {

        BB.printF();
    }


}




class AA{

    static void printF(){
        System.out.println("PrintF from A");
    }
}

class BB extends AA{


}
