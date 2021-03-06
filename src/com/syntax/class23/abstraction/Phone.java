package com.syntax.class23.abstraction;

public abstract class Phone {

    void makePhoneCalls(){

        System.out.println("Making a call");
    }

    void sendText(){
        System.out.println("Sending a text");
    }

    abstract void displayPictures();
    abstract void unlockPhone();
}

class Iphone extends Phone{
    @Override
     void displayPictures(){
        System.out.println("Iphones uses Photos app to display the pictures");
    }
    @Override
    void unlockPhone(){
        System.out.println("Use FaceID to unlock the phone");

    }
}

class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Use fingerprint senseor to unlock phone");
    }

    @Override
    void unlockPhone() {
        System.out.println("Use Gallary app to view pictures");
    }
}
