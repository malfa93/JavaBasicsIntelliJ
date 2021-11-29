package com.syntax.class23.abstraction;

public class PhoneTester {

    public static void main(String[] args) {

        //Phone phone = new Phone(); can not make an object for the abstract class****

        Iphone iphone = new Iphone();
        iphone.displayPictures();
        iphone.unlockPhone();
        iphone.makePhoneCalls();
        iphone.sendText();

        Samsung samsung=new Samsung();
        samsung.displayPictures();
        samsung.unlockPhone();
        samsung.makePhoneCalls();
        samsung.sendText();

        Phone[] phones={new Iphone(), new Samsung()};

        for(Phone ph:phones){
            ph.displayPictures();
            ph.makePhoneCalls();
            ph.unlockPhone();
            ph.sendText();
        }

    }
}
