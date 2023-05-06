package com.masai.verdant_straw_7365.Services;



import com.masai.verdant_straw_7365.DAOIntrafaces.Authorization;
import com.masai.verdant_straw_7365.DTO.Customer;
import com.masai.verdant_straw_7365.DataBase.EMUtils;

public class AuthorizationImple implements Authorization {
	
	public boolean AdminAuthorization (String username , String password) {
		
		if (username.equals("admin") && password.equals("admin")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public int userAuthorization (String username , String password) {
		Customer customer = EMUtils.getEntityManager().find(Customer.class,username);
		System.out.println(customer);
		if (customer == null) return -2;
		else if(customer.getCustomerPassword().equals(password)) {
			return customer.getCustomerId();
		}else {
			return -1;
		}
		
	}
}
