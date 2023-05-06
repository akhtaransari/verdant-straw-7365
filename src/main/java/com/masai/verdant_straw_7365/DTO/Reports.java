package com.masai.verdant_straw_7365.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Reports {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reportID;
	
	private String reportName;
	private String reportType;
	
	
	public Reports() {
		super();
	}


	public Reports(String reportName, String reportType) {
		super();
		this.reportName = reportName;
		this.reportType = reportType;
	}


	@Override
	public String toString() {
		return "Reports [reportID=" + reportID + ", reportName=" + reportName + ", reportType=" + reportType + "]";
	}


	public int getReportID() {
		return reportID;
	}


	public void setReportID(int reportID) {
		this.reportID = reportID;
	}


	public String getReportName() {
		return reportName;
	}


	public void setReportName(String reportName) {
		this.reportName = reportName;
	}


	public String getReportType() {
		return reportType;
	}


	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	
	
	
}
