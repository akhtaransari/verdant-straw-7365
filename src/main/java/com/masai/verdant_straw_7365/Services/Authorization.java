package com.masai.verdant_straw_7365.Services;

public class Authorization {
	
	boolean AdminAuthorization (String username , String password) {
		
		if (username.equals("admin") && password.equals(password))
			return true;
		else return false;
	}
	
	boolean userAuthorization (String username , String password) {
		
		if (username.equals("admin") && password.equals(password))
			return true;
		else return false;
	}
}
