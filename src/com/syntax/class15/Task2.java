package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str =" fjsl;kfjsSDJFKSDJ123456%^&*%";
		
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());

	}

}
