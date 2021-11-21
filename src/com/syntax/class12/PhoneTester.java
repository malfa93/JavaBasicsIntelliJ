package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone iphone=new Phone();
		iphone.make="Iphone";
		iphone.model="Iphone 13 Pro Max";
		iphone.RAM=6;
		iphone.ROM=512;
		iphone.screen=36;
		
		iphone.makephonecalls();
		iphone.takePictures();
		
		Phone googlePixel=new Phone();
		
		googlePixel.make="Google";
		googlePixel.model="Pixel 6 Pro";
		googlePixel.RAM=6;
		googlePixel.ROM=512;
		googlePixel.screen=36;
		
		googlePixel.makephonecalls();
		googlePixel.takePictures();
		
		

	}

}
