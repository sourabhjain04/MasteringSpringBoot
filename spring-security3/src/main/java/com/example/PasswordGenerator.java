package com.example;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


	public class PasswordGenerator {
	    public static void main(String[] args) {
	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	        String encodedPassword = encoder.encode("koenig");
	        System.out.println("Encoded Password: " + encodedPassword);
	    }
	}


