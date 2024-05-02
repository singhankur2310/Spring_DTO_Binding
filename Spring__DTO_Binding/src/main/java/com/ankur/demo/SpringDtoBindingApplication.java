package com.ankur.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ankur.demo.Repository.locationrepo;
import com.ankur.demo.Repository.user__repo;
import com.ankur.demo.model.location;
import com.ankur.demo.model.user;

@SpringBootApplication
public class SpringDtoBindingApplication implements CommandLineRunner{
	@Autowired
	private user__repo userrepo;
	@Autowired
	private locationrepo locationrepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDtoBindingApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		location loc = new location();
		loc.setPlace("Noida");
		loc.setDescription("Noida Is great place in India ");
		loc.setLongitude(40.6);
		loc.setLatitude(30.25);
		locationrepo.save(loc);
		
		user us = new user();
		us.setFirstname("Ankur");
		us.setLastname("Singh");
		us.setEmail("ankur235@tcs.org");
		us.setPassword("secret");
		us.setLocation(loc);
		userrepo.save(us);
		
		user us1 = new user();
		us1.setFirstname("Ankita");
		us1.setLastname("Singh");
		us1.setEmail("ankita235@tcs.org");
		us1.setPassword("secretA");
		us1.setLocation(loc);
		userrepo.save(us1);
		
		user us2 = new user();
		us2.setFirstname("Anjali");
		us2.setLastname("Gaikwad");
		us2.setEmail("anjali235@tcs.org");
		us2.setPassword("secretG");
		us2.setLocation(loc);
		userrepo.save(us2);
		
		
	}

}
