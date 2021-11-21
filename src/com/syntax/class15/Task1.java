package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello my name is Mohammed";
		
		System.out.println(str.replace(" ", ""));
		System.out.println(str); // Strings are immutable, it is used for a String value that needs to be the same across the board
		
		
		StringBuilder str2 = new StringBuilder("Hello my name is Mohammed");
		System.out.println(str2.reverse());
		System.out.println(str2); // String Builder is mutable, it is good to use when the value stored in it will be changed constantly 

	}

}
