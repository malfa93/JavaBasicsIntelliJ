package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String name = "";
			System.out.println(name.isEmpty());
		name ="Silvia";
			System.out.println(name.isEmpty());
		name="    ";
			System.out.println(name.isBlank());
			
			
			String str="     Batch 11 is...     ";
			System.out.println(str.trim());
			
			
			String str2= "This is a easy class";
			System.out.println(str2.toLowerCase().startsWith("T"));
			System.out.println(str2.startsWith("L"));
			System.out.println(str2.startsWith("This"));
			System.out.println(str2.endsWith("E"));
		

	}

}
