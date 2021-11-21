package com.syntax.class21;

public class Parent{

   public void method(int num){
        int number = 10;

        switch (number) {
            case 10:
                System.out.println("hello");
                break;
            case 20:
                System.out.println("hello 20");
                break;
            case 30:
                System.out.println("hello 30");
                break;
        }



    }


    class Child extends Parent{

//        @Override
//        void method(int num) {
//        System.out.println(num);
//
//        }


        @Override
        public void method(int num) {
            super.method(num);
        }
    }
}
