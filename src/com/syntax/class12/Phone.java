package com.syntax.class12;

public class Phone {
	
	String make;
	String model;
	int RAM;
	int ROM;
	double screen;
	int camera;
	
	void makephonecalls() {
		System.out.println(make+" "+model+" is calling someone");
	}
	
	void takePictures() {
		System.out.println(make+" "+model+" is taking pictures");
	}

}
