package com.syntax.class22;

public class FatherTester {
    public static void main(String[] args) {

        Father son = new Son("Sharif");
        // Son fath = new Father("SharifsFather"); can not do this.


        Son sharifObj = (Son) son;



    }
}
