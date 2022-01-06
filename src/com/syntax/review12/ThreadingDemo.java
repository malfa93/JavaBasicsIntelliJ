package com.syntax.review12;

public class ThreadingDemo {
    public static void main(String[] args) {

        Thread t1=null;
        for (int i = 0; i <10; i++) {
            t1=new Thread(() -> System.out.println("Thread 1"));
        }

        Thread t2=null;
        for (int i = 0; i < 10; i++) {
            t2=new Thread(() -> System.out.println("Thread 2"));
        }

        t1.start();
        t2.start();

    }
}
