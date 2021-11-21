package com.syntax.class01;

public class Diploma {

	public static void main(String[] args) {
		boolean dip=true;
		double gpa=3.6;
		
		if(dip) {
			System.out.println("Congratulations!");
			if(gpa>3.5) {
				System.out.println("You're elegible for a scholarship");
			} else {
				System.out.println("You should have studuied harder");
			}
		}
		else {
			System.out.println("You should get a degree");
		}

	}

}
