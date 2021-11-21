package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		
		Dog alonasDog= new Dog();
		alonasDog.name="Lexy";
		alonasDog.breed="American Hound";
		alonasDog.color="Black";
		alonasDog.height=2.5;
		alonasDog.age=10;
		alonasDog.gender='M';
		
		System.out.println("My dog's name is "+alonasDog.name);
		System.out.println("My dog's breed is "+alonasDog.breed);
		System.out.println("My dog's color is "+alonasDog.color);
		
		
		Dog jimmysDog = new Dog();
		jimmysDog.name="Teddy";
		jimmysDog.breed="Larador Retriever";
		jimmysDog.color="Golden";
		jimmysDog.height=5;
		jimmysDog.age=5;
		jimmysDog.gender='M';
		
		System.out.println("My dog's name is "+jimmysDog.name);
		System.out.println("My dog's breed is "+jimmysDog.breed);
		System.out.println("My dog's color is "+jimmysDog.color);
		
		Dog arwasDog=new Dog();
		arwasDog.name="Monroe";
		
		System.out.println("My dog's name is "+arwasDog.name);
		
		
		
	}

}
