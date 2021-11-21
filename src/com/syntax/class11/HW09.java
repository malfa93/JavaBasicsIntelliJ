package com.syntax.class11;

public class HW09 {

	public static void main(String[] args) {
		
		
		
		// Maximum and minimum number in the array?
				int max = 0;
				int min = 0;
				int[][] numbers = { { 56,98,56,-78 },
									{ 98,56,-34 },
									{ -9,76,54,132,785 }
									};
				for (int i = 0; i < numbers.length; i++) {
					for (int j = 0; j < numbers[i].length; j++) {
						if (max < numbers[i][j]) {
							max = numbers[i][j];
						} else if (min > numbers[i][j]) {
							min = numbers[i][j];
						}
					}
				}
				System.out.println("Max number is " + max + ". Min number is " + min);
			}
	}

