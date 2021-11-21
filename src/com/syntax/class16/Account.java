package com.syntax.class16;

public class Account {
	
	private String userName;
	private String password;
	private String name;
	private String address;
	private double accountBalance;
	// get from gitHub!!!!!!
	
	public void setUserName(String accountuserName) {
		
		if(accountuserName.length()<16) {
			userName=accountuserName;
		}else {
			System.out.println("UserName of this length is not allowed");
		}
		
		public void getBalance(String accountuserName, String accountPassword) {
			
			if(userName.contentEquals(accountuserName)&&password.contentEquals(accountPassword)) {
				
				
			}
			
			
		}
		
		
	}
}
