package com.spring.collectionall;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	private List<String> subjects;
	
	@Autowired
	private Set<String> skills;
	
	@Autowired
	private Map<String, Integer> marks;
	
	
	
	public void showDetails() {
		System.out.println("Subjects: "+ subjects);
		
		System.out.println("Skills: "+skills);
		
		System.out.println("Makrs:"+marks);	
		
	}
}
