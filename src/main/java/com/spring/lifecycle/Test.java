package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Lifecycle Class");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
		Example example = (Example) context.getBean("example");
		System.out.println(example);
		context.registerShutdownHook();
	}

}
