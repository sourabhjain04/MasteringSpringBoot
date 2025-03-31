package com.spring.beanall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car mycar = context.getBean(Car.class);
		
		mycar.start();
	}

}
