package com.syntax.class16;

public class StudentTester {

	public static void main(String[] args) {
		
Student s1 = new Student();// this is an object
		
		s1.name = "Moe";
		s1.id = "123";
		s1.num++;
		
Student s2 = new Student();// this is another object
		
		s2.name = "Moe";
		s2.id = "123";
		s2.num++;
		
Student s3 = new Student();// this is the third object
		
		s3.name = "Moe";
		s3.id = "123";
		s3.num++;
		
		
		System.out.println(Student.num);

	}

}
