package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeRestController {

	@GetMapping("/home")
	public String getMsg() {
		String msg ="Welcome to Bank";
		return msg;
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		
		return "welcome to Dashboard";
	}
	
	@GetMapping("/balance")
	public String getbalance() {
		String msg = "Your Current balance is 5000";
		return msg;
	}
	
	@GetMapping("/statement")
	public String getStmt() {
		String msg = "your statement is sent to your email id";
		return msg;
	}
	
	@GetMapping("/myloan")
	public String getMyLoan() {
		String msg = "Your Loan amount is 50000";
		return msg;
	}
	
	@GetMapping("/contact")
	public String contact() {
		String msg = "Thank you my contact no is 9926637944";
		return msg;
	}
}
