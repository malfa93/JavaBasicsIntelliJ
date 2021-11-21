package com.syntax.class12;

public class MethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("line before method call");
		
		Methods methods = new Methods();
		
		methods.sayHello();
		
		System.out.println("----------");
		
		System.out.println("Line after method call");
		
		
		methods.sayHelloManyTimes();
		
		System.out.println("----------");
		
		methods.times=3; /*Giving a value in times here will override 
		 				  *any value of times that is in the Methods class
		 				  */
		methods.sayHelloManyTimesWithState();
		
		System.out.println("----------");
		
		methods.sayHelloManyTimesWithStateParameter(5);
		
		
	}

}
