package com.syntax.class16;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee emp1 =new Employee();
		
		emp1.empId = "123";
		emp1.Salary = 100000;
		
Employee emp2 =new Employee();
		
		emp2.empId = "456";
		emp2.Salary = 120000;
		
		System.out.println(emp1.empId);
		System.out.println(emp1.Salary);
		
		System.out.println(emp2.empId);
		System.out.println(emp2.Salary);
		
		System.out.println(Employee.CEO); // to call onto the static variable always use the name of the class.
	}

}
