package com.syntax.class16;

public class RecapTester {

	public static void main(String[] args) {
		
		
		Recap recap = new Recap();
		
		recap.number=10;
		recap.setConstantNumber();
		recap.setNumber(50);
		recap.printNumber();
		
		Recap recap2 = new Recap();
		recap.setNumber(50);
		recap2.printNumber();

	}

}
