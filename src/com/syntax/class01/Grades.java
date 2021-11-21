package com.syntax.class01;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		System.out.println("Write three numbers and I will give you your average");
		
		Scanner scan = new Scanner (System.in);
		
		double first, sec, third;
		double avg;
		
		
		first=scan.nextInt();
		sec=scan.nextInt();
		third=scan.nextInt();
		
		avg=(first+sec+third)/3;
				
				
		System.out.println("The average score is "+String.format("%.2f",avg));
		
		if(avg>=90 && avg<=100) {
			System.out.println("Your average grade is A");
			
		}

	}

}
