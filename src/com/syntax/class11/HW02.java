package com.syntax.class11;

public class HW02 {

	public static void main(String[] args) {

		/* Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */
		int [][] numbers= {
				{67,34,24,12,100},
				{34, 60, 55, 80},
		};
		
		for(int i=0; i<numbers.length; i++) {
			for( int j=0; j<numbers[i].length; j++) {
				if(numbers[i][j]%2==0) {
					System.out.print(numbers[i][j]+ " ");
					
				}
			}
	}
	}
}


