package com.syntax.class01;

import java.util.Scanner;

public class SeasonBirth {

	public static void main(String[] args) {
		
		// Dec, Jan, Feb: Winter
		// March, April, May: Spring
		// June, July, August: Summer
		// Sep, Oct, Nov: Autumn
		
		
		System.out.println("Hello!");
		System.out.println("Tell me what month you are born in choosing a number between 1-12");
		Scanner scan = new Scanner (System.in);
		
		int mh;
		mh= scan.nextInt();

if(mh==12 || mh==1 || mh==2) {
	System.out.println("You were born in season: Winter");
}else if(mh==3 || mh==4 || mh==5) {
	System.out.println("You were born in season: Spring");
	
}else if(mh==6 || mh==7 || mh==8) {
	System.out.println("You were born in season: Summer");
}else if (mh==9 || mh==10 || mh==11) {
	System.out.println("You were born in season: Autumn");
}else {
	System.out.println("Please input a number within the range 1-12 only");
}
	}

}
