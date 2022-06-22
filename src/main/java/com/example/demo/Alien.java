package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	private int id;
	private String name;
	private String email;
	
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void show() {
		System.out.println("In Show method");
		laptop.setBrand("Lenovo");
		laptop.setPrice(35000);
		laptop.showLaptop();
	}
}
