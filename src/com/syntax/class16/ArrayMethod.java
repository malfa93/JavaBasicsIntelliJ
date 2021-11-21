package com.syntax.class16;

public class ArrayMethod {
	
	int arraySum(int[] arrNum) {
		
		int sum = 0;
		
		//arrNum = {2, 5, 7, 1};
		
		for(int number:arrNum) {
			sum=sum+number;
		}
		return sum;
	}

}
