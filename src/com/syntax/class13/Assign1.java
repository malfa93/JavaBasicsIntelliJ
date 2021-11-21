package com.syntax.class13;

import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		
		
		String user, pass, pass2, conpass;
		
		conpass="********";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please create your username:");
		
		user=scan.next();
		
		System.out.println("Please create your password:");
		
		pass=scan.next();
		
		System.out.println("Please confirm your password");
		
		pass2=scan.next();
		
		if(user.isEmpty() || pass.isEmpty()) {
			
			System.out.println("Username and Password cannot be empty");
			
		}else if(pass.length()<conpass.length()) {
			
			System.out.println("Password too short");
		}else if(pass.contains(user)) {
			
			System.out.println("Password cannot contain username");
		}else if(!pass.contentEquals(pass2)) {
			
			System.out.println("Passwords do not match");
		}else {
			
			System.out.println("Your username and password has been created");
		}
		

	}

}
