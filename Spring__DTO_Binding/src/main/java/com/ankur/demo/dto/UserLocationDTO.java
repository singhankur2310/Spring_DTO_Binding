package com.ankur.demo.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
	private int userid;
	private String email;
	private String place;
	private String description;
	private double longitude;
	private double latitude;

}
