package com.spring.scopeexample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class MyBean {
	
	public MyBean() {
		System.out.println("MyBean Instance created: "+this);
	}

	
	public void showMessage() {
		System.out.println("Hello form Mybean ! instacne: "+this);
	}
}
