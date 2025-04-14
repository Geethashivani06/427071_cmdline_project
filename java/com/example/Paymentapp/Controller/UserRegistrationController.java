package com.example.Paymentapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class UserRegistrationController {
	@GetMapping("/register")
	public String showHome() {
		System.out.println("User Registration Controller");
		return "register";
	}
}