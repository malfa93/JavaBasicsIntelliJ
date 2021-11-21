package com.syntax.class17;

public class Cow {

	static int prices = 5;
	String name;
	String breed;
	String color;
	int age;
	double weight;

	public Cow() {

		System.out.println("Important line of code");

	}

	public Cow(String name) {
		
		this();
		this.name = name;
	}

	public Cow(String name, String breed) {

		// this.name = name;
		this(name);
		this.breed = breed;
	}

	public Cow(String name, String breed, String color) {
		// this.name = name;
		// this.breed = breed;
		this(name, breed);
		this.color = color;
	}

	public Cow(String name, String breed, String color, int age) {
		// this.name = name;
		// this.breed = breed;
		// this.color = color;
		this(name, breed, color);
		this.age = age;
	}

	public Cow(String name, String breed, String color, int age, double weight) {
		// this.name = name;
		// this.breed = breed;
		// this.color = color;
		// this.age = age;
		this(name, breed, color, age);
		this.weight = weight;
	}

	void printAllInfo() {

		System.out
				.println("name " + name + " breed " + breed + " color " + color + " age " + age + " weight " + weight);
	}
}
