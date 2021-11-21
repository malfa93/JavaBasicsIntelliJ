package com.syntax.class17;

public class Book {
	
	/*Write Book class that will have instance variables and 2 Constructors. 
	 * While creating an object make sure:
	 * Instance variables are being initialized 
	 * Both Constructors are being executed
	 */

	
	
	String name;
	String author;
	int price;
	
	Book(){
		
	}

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public Book(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	void printBook() {
		
		System.out.println(name+" "+author+" "+price);
	}
	
	
	
	
	
	
	
}
