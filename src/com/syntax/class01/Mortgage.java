package com.syntax.class01;

public class Mortgage {

	public static void main(String[] args) {
		double rate;
		int price;
		rate=4.4;
		price=200000;
		
		if(rate<4.5) {
			System.out.println("You can buy the house");
			if(price>200000) {
				System.out.println("You need to take a loan");
			}
			else {
				System.out.println("You do not need a loan");
			}
		} else {
			System.out.println("You can not buy the house");
		}

	}

}
