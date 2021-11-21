package com.syntax.class11;

import java.util.Scanner;

public class HW04 {

	public static void main(String[] args) {
		// Create an array on double values using scanner and calculate the sum of all stored elements in that array.
		Scanner inp=new Scanner(System.in);
		System.out.println("Print how many values you would like to store");
		int num=inp.nextInt();
		double sum=0;
		double [] values=new double[num];
		for(int i=0; i<values.length; i++) {
			System.out.println("Please enter the values");
			values[i]=inp.nextDouble();
			sum+=values[i];
		}
		
			System.out.println(sum);
			
			
				
			}
		
		
			
	
		
		

	}


