package com.syntax.class15;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Moe";
		String str2="Deena";
		str=str+str2;
		str2=str.replace(str2,"");
		str = str.replace(str2, "");
		System.out.println(str);
		System.out.println(str2);

	}

}
