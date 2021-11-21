package com.syntax.class15;

public class Task5 {

	public static void main(String[] args) {
		// How would you check if String is a palindrom or not.

		
		String str = "aba";
				
		StringBuilder strP = new StringBuilder (str);
		
		strP.reverse();
		
		if(str.equals(strP.toString())) { // .toString is to convert the String builder to a normal string in order for the if statemnet to be true.
			
			System.out.println(str+" is a palindrome");
		}else {
			
			System.out.println(str+" is not a palindrome");
		}
		
		
	}

}
