package com.syntax.class01;

import java.util.Scanner;

public class DayClasses {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter todays day");
		
		String day=scan.next();
		
		if(day.contentEquals("monday") || day.contentEquals("friday")) {
			System.out.println("No class");
		}

	}

}
