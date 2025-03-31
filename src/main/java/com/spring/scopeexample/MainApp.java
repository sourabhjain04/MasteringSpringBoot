package com.spring.scopeexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Retrieve MyBean multiple times
		
		
		MyBean bean1 = context.getBean(MyBean.class);
		
		bean1.showMessage();

		MyBean bean2 = context.getBean(MyBean.class);
		
		bean2.showMessage();
		
		System.out.println("Are both instances same? "+ (bean1==bean2));
		
		
	}

}
