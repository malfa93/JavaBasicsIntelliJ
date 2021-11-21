package com.syntax.class21.poly;

public class Cars {

    void start(){
        System.out.println("Use keys to starts me");
    }

    void stop(){

        System.out.println("Use brakes to stop me");
    }

    void park(){

        System.out.println("Park me manually");
    }
}

class BMW extends Cars{

    @Override
    void start() {
        System.out.println("Use the Button to start me");
    }
}
class Tesla extends Cars{

    @Override
    void start() {
        System.out.println("Use Mobile App to start me");
    }

    @Override
    void park() {
        System.out.println("Use parking sensors to park me");
    }
}

class Toyota extends Cars{

}