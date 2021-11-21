package com.syntax.class13;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String name=new String("Sebastian");
		String name1="Mykl";
		System.out.println(name1.length());
		System.out.println(name.length());
		
		
		
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		
		String str="This is easy 123456 ^%&*";
		
		System.out.println(str.toLowerCase());
		
		System.out.println(name.concat(name1));//not recommended to use
		
		int number = 10;
		
		System.out.println(name+name1+number);
		//System.out.println(name.concat(name1).concat(number));
	}
	
	

}
