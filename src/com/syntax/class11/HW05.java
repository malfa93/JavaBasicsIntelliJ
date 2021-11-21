package com.syntax.class11;

public class HW05 {
	
	public static void main(String[] args) {
		
		//Create 2D arrays to show countries with their capitol using 2 types of loops
		
		
		String[][] ctry ={
				
				{"USA", "Canada", "Spain"},
				{"D.C.", "Ottawa", "Madrid"}
		};
		
		System.out.println("Enhanced for loop: ");
		System.out.println("-----------------");
		
		for(String[] country:ctry) {
			
			for(String cap:country) {
				
				System.out.print(cap+"  ");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Regular for loop ");
		System.out.println("-----------------");
		
		for (int i = 0; i < ctry.length; i++) {

			for (int j = 0; j < ctry[i].length; j++) {

				String element = ctry[i][j];
				System.out.print(element + "  ");
			}

			System.out.println();

		}
		
		
		
	}

}
