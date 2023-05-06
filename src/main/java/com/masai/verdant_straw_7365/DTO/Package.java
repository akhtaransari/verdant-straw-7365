package com.masai.verdant_straw_7365.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Package {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int packageId;
	
    private String packageName;
    private String packageDescription;
    private String packageType;
    private double packageCost;
    private double paymentDetails;
    
    public Package() {
		super();
	}
    
    
    
    public Package(String packageName, String packageDescription, String packageType, double packageCost) {
		super();
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
	
	}
    
	public Package(String packageName, String packageDescription, String packageType, double packageCost,double paymentDetails) {
		super();
		this.packageName = packageName;
		this.packageDescription = packageDescription;
		this.packageType = packageType;
		this.packageCost = packageCost;
		this.paymentDetails = paymentDetails;
	}
	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", packageType=" + packageType + ", packageCost=" + packageCost
				+ ", paymentDetails=" + paymentDetails + "]";
	}
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageDescription() {
		return packageDescription;
	}
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public double getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
	public double getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(double paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
    
	
	
    
    
}
