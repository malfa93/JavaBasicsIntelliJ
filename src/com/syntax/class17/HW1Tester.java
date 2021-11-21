package com.syntax.class17;

public class HW1Tester {

	public static void main(String[] args) {

		new HW1();
		// new HW1("Toyota"); The constructor is private, and can not be accessed.
		new HW1("Toyota", "Black");
		// new HW1("Toyota","Black", 1); Protected required inheritance to be accessed

	}

}
