package com.ankur.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class user {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String email;
		@Column(name = "first__name")
		private String firstname;
		@Column(name = "last__name")
		private String lastname;
		private String password;
		
		@ManyToOne(fetch = FetchType.EAGER,optional = false)
		@JoinColumn(name = "location_id")
		private location location;
		
}
