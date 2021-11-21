package com.syntax.class17;

public class carTester {

	public static void main(String[] args) {
		
		Car car = new Car("Tesla Model X", "Tesla",
				"Model X", "Black", 2018, -1,"VIN123", -1,
				300, true);
		
		car.printName();
		
		Car car2 = new Car("Tesla model X");
				car2.printName();
				
		Car car3 = new Car();
				car3.sayHello();
				
				

	}

}
