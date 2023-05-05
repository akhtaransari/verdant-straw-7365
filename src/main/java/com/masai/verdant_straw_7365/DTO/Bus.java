package com.masai.verdant_straw_7365.DTO;

import jakarta.persistence.*;

@Entity
@Table(name = "buses")
public class Bus {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busid;
    
    @Column(name = "bus_type")
    private String busType;
    private String busNumber;
    private int busCapacity;
    
    
    
    }
