package com.syntax.class17;

public class Student {
	
	/*Write a Student class 
	 * that have instance variables name 
	 * and address. Create a constructor 
	 * that will initialize those 
	 * variables. Print name & address 
	 * of given  student using displayInfo 
	 * method.
	 */

	
	
	String name;
	String addy;
	
	Student(){
		
		
	}

	public Student(String name, String addy) {
		this.name = name;
		this.addy = addy;
	}
	
	void displayInfo() {
		
		System.out.println("Name: "+name);
		System.out.println("Address: "+addy);
	}
	
	
	
	
	
	
}
