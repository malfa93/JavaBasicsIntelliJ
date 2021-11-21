package com.syntax.class01;
import java.util.Scanner;

public class GradeExp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your grade");
		char grade = scan.next().charAt(0);
	String exp;
	
	switch(grade) {
	case 'A':
		exp = "Excellent";
	break;
	case'B':
		exp="Good";
		break;
	case'C':
		exp="Average";
		break;
	case 'D':
		exp="Bad";
		break;
		default:
			exp = "Not Acceptable";
			break;
	}
	
	System.out.println("Having "+grade+" means that your grades are "+exp);
		

	}

}
