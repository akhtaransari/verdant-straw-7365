package com.masai.verdant_straw_7365.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
	@Id
    @Column(unique = true, nullable = false)
    private String customerUsername;
    private String customerPassword;
    private String address;
	private String mobile;
    private String email;
    
    public Customer() {
		super();
	}

	public Customer(String customerUsername, String customerPassword, String address, String mobile, String email) {
		super();
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerUsername=" + customerUsername + ", customerPassword="
				+ customerPassword + ", address=" + address + ", mobile=" + mobile + ", email=" + email + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
}
