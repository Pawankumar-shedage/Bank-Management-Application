package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

	//Home Mapping.
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("AboutUs")
	public String about()
	{
		return "AboutUs";
	}
	
	
	
	
	
}
