package com.example.demo;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component("lap1")
@Data
public class Laptop {
	
	private String brand;
	private int price;
	
	
	public void showLaptop() {
		// System.out.println("Laptop Brand: " + getBrand());
		// System.out.println("Laptop Price: " + getPrice());
	}

}
