package com.spring.autowire;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike is Running");
	}

}
