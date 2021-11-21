package com.syntax.class11;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		
		
		Human tamana = new Human ();
		tamana.name="Tamana";
		tamana.age=16;
		tamana.height=5.8;
		tamana.weight=30;
		tamana.gender='F';
		tamana.bloodType="A+";
		
		tamana.eat();
		tamana.sleep();
		tamana.walk();
		tamana.sendMemes();
		
		System.out.println();
		
		Human sebastian = new Human();
		
		sebastian.name="Sebastian";
		sebastian.age=18;
		sebastian.weight=100;
		sebastian.gender='M';
		sebastian.bloodType="A-";
		
		
		sebastian.eat();
		sebastian.sleep();
		sebastian.walk();
		sebastian.sendMemes();
		
		Scanner scan.new Scanner(System.in);

	}

}
