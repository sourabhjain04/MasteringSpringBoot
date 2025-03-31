package com.spring.autowire;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		System.out.println("car is Starting");
		
	}

}
