package com.syntax.class11;

public class HW06Swap {

	public static void main(String[] args) {
		int x = 32;
	    int y = 63;
	    // Code to swap 'x' and 'y'
	    x = x * y; // x now becomes 2016
	    y = x / y; // y becomes 32
	    x = x / y; // x becomes 63
	    System.out.println("After swaping:"
	              + " x = " + x + ", y = " + y);

	}

}
