package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	
	@Autowired
	@Qualifier("bike")
	private Vehicle vehicle;
	
	public void travel() {
		vehicle.start();
		System.out.println("Person is travelling");
	}
}
