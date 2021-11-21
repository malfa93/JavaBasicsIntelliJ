package com.syntax.class11;

public class HW03 {

	public static void main(String[] args) {
		//Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.
		
				int[][] evenNumbers= {
						{0,2,4},
						{6,8,10},
				};
				
				int sum=0;
				for(int i=0; i<evenNumbers.length; i++) {
					for(int j=0; j<evenNumbers[i].length; j++)
				sum += evenNumbers[i][j];
					
						
					}
					System.out.println(sum+ " is the sum of Even Numbers");
					
					
			
			
				int[][] oddNumbers= {
					{1,3,5},
					{7,9,11},
				};
				
				//int sum=0;
				for(int i=0; i<oddNumbers.length; i++) {
					for(int j=0; j<oddNumbers[i].length; j++) {
						sum += oddNumbers[i][j];
						
					}
					System.out.println(sum +" is the sum of Odd Numbers");
				}
	}
}
			
			
