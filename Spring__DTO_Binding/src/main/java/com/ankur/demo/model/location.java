package com.ankur.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Locations")
public class location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String place;
	private String description;
	private double longitude;
	private double latitude;
	
	

}
