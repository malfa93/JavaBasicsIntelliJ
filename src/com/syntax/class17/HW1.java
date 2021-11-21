package com.syntax.class17;

public class HW1 {

	/*
	 * Write a java class that have 4 constructors with 4 different access levels of
	 * constructors(private,public,default,protected) and create 4 objects of this
	 * class: 1 - inside same class; 2 - from outside the class; 3 - from different
	 * class inside different package and observe result.
	 */

	String brand;
	String color;
	String type;
	int quantity;

	HW1() {
		
		System.out.println("Default");

	}

	private HW1(String brand) {
		
		System.out.println("Private");
		this.brand = brand;
	}

	public HW1(String brand, String color) {
		
		System.out.println("Public");
		this.brand = brand;
		this.color = color;
	}

	protected HW1(String brand, String color, String type, int quantity) {
		
		System.out.println("Protected");
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.quantity = quantity;
	}

}
