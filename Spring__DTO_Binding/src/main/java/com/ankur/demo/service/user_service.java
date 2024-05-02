package com.ankur.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankur.demo.Repository.user__repo;
import com.ankur.demo.dto.UserLocationDTO;
import com.ankur.demo.model.user;

@Service
public class user_service {
	@Autowired
	private user__repo userrepo;
	
	
	public List<UserLocationDTO> getAlluserLocation(){
		
		
		return userrepo.findAll().stream().
				map(this::converLocationDTO)
				.collect(Collectors.toList());
		
		
	}
	private UserLocationDTO converLocationDTO(user userr) {
		UserLocationDTO userlocation = new UserLocationDTO();
		userlocation.setUserid(userr.getId());
		userlocation.setEmail(userr.getEmail());
		userlocation.setPlace(userr.getLocation().getPlace());
		userlocation.setLongitude(userr.getLocation().getLongitude());
		userlocation.setLatitude(userr.getLocation().getLatitude());
		userlocation.setDescription(userr.getLocation().getDescription());
		return userlocation;
		
	}
	

}
