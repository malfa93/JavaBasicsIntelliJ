package com.syntax.class14;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="dafghGHAGSJHahgdhaHGSDHjdkf$%^&()1234567889";
				
		System.out.println(str.replaceAll("[012345]", "*"));
		//or
		System.out.println(str.replaceAll("[0-5]", "*"));
		
		System.out.println(str.replaceAll("[a-z]", "*"));
		
		System.out.println(str.replaceAll("[A-Z]", "*"));
		
		System.out.println(str.replaceAll("[A-Za-z]", "*"));
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "*")); // the ^ symbol is like the !
		
		System.out.println(str.replaceAll("[$&]", "*"));	
		
		System.out.println(str.replaceAll("[0-5]", ""));
				

	}

}
