package com.syntax.class16;

public class AccessModifiersDemo {

		private String name;
		int age;
		public double salary;
		
		void displayName() {
			System.out.println(name);
		}
		
		void displayAge() {
			
			System.out.println(age);
		}
		
		void displaySalary() {
			System.out.println(salary);
		}
		
		
		public static void main(String[] args) {
			
			AccessModifiersDemo am = new AccessModifiersDemo();
			am.name="Nabil";
			am.age=23;
			am.salary=120000;
			
			
			
		}
		
		
		
		
		
		
	

}
