package com.syntax.class17;

public class DogTester {

	public static void main(String[] args) {
		
		Dog dog=new Dog("Boby", "Black", "Bulldog",10, 12.5);
		
		//new Dog()     This can call the constructor.
		
		dog.printName();
		dog.printBreed();
		dog.printAge();
		

	}

}
