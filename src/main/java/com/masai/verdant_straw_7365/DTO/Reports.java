package com.masai.verdant_straw_7365.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "reports")
public class Reports {
private int reportID;
private String reportName;
private String reportType;
}
