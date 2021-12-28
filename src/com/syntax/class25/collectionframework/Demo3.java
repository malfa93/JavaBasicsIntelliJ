package com.syntax.class25.collectionframework;

public class Demo3 {
    public static void main(String[] args) {

        int primitiveNum = 10;

        Integer classNum = primitiveNum;
        System.out.println(classNum);

        Integer num = new Integer(20); // This is called boxing a primitive inside a wrapper.
        Integer num2 = 10; // This is called Autoboxing, ie putting a primitive inside a wrapper but using shortcut
        int num3 = num.intValue(); // Unboxing longer way
        int num4 = num2; //Auto Unboxing shorter way.


    }
}
