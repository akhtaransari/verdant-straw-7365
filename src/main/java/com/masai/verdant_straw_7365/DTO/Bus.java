package com.masai.verdant_straw_7365.DTO;

import jakarta.persistence.*;

@Entity
@Table(name = "buses")
public class Bus {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @Column(name = "registration_number")
    private String registrationNumber;
    
    @Column(name = "model")
    private String model;
    
    @Column(name = "capacity")
    private int capacity;
	

    // Getters and setters
}
