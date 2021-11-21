package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String name = "This class is easy";
		
		System.out.println(name.contains("class"));
		System.out.println(name.contains("Lemon"));
		System.out.println(name.contains("i"));
		
		String str2 ="Hello";
		String str3 ="heljadfjdhjghlo";
		
		System.out.println(str2.contentEquals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println(str2.charAt(0));
		System.out.println(str2.toUpperCase().charAt(2));
		
		System.out.println(str2.indexOf('l'));
		System.out.println(str3.indexOf('l',3));// when you want to find the location of the second l in the word hello
		System.out.println(str3.indexOf('l', str3.indexOf('l')+1)); // the +1 is to start looking for the send l at index 3.
		
		System.out.println(name.substring(5)); // start at index 5 of string name.
		System.out.println(name.substring(5,11)); // start at index 5 of string name and ends at index 11
		
		
		
		
	}

}
