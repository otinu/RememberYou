package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@Size(min = 2, max = 30)
	private String assignment;
	
	@Max(200)
	private String feature;

}
