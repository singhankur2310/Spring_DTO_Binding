package com.ankur.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankur.demo.dto.UserLocationDTO;
import com.ankur.demo.service.user_service;

@RestController
public class user_controller {
	@Autowired
	private user_service userservice;
	
	
	@GetMapping("/user_locations")
	public List<UserLocationDTO> getAllusersLocation(){
		return userservice.getAlluserLocation();
	}
}
