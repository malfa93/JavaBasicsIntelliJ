package com.syntax.class15;

public class DogTester {

	public static void main(String[] args) {
		
		Dog dog =new Dog();
		dog.name = "Casper";
		dog.color = "Black";
		dog.sleep();
		dog.noOfLegs=4;
		
		Dog dog2 =new Dog();
		dog2.name = "Caspersky";
		dog2.color = "White";
		dog2.sleep();
		
		
		System.out.println(dog2.noOfLegs);// static variables can be accessed using different objects, ie, dog and dog2.
		System.out.println(dog2.name);

	}

}
