package com.syntax.class11;

public class HW01 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
				int[][] numbers = { 
						{ 7, 3, 9, 56, 23, 90 }, 
						{ 56, 89, 12, 5, 9, 12 }, 
						{ 567, 23, 89, 678, 14 }, 
						};
				int sum = 0;
				for (int i = 0; i < numbers.length; i++) {
					for (int j = 0; j < numbers[i].length; j++) {
						sum += numbers[i][j];
					}
				}
				System.out.println("Sum of all numbers is " + sum);

	}

}
