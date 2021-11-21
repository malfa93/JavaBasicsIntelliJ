package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// How would you reverse a String word by word?
		
		String str = "This is a sentence I want to reverse";
		
		String [] strArr=str.split(" ");
		
		for(String word:strArr) {
			
			StringBuilder str2 = new StringBuilder(word);
			
			System.out.print(str2.reverse()+" ");
			
			
			
			
		}

	}

}
