package com.spring.collectionall;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.spring.collectionall")
public class AppConfig {

	@Bean
	public List<String> subjects(){
		return Arrays.asList("Math","Science","History","English");
		
	}
	@Bean
	public Set<String> skills(){
		return new HashSet<>(Arrays.asList("Java","Spring","SQl","Python"));
		
	}
	
	 @Bean
	 public Map<String, Integer> marks() {
	        Map<String, Integer> marks = new HashMap<>();
	        marks.put("Math", 90);
	        marks.put("Science", 85);
	        marks.put("History", 88);
	        marks.put("English", 92);
	        return marks;
	    }
	
}
