package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/account")
public class AccountController {
	@RequestMapping("/form")
	public String AccountForm() {
		return "accountform";
	}
	@RequestMapping(value="/adminlogin", method=RequestMethod.POST)
	public String AdminLogin() {
		return "adminlogin";
	}
	@RequestMapping(value="/userlogin", method=RequestMethod.POST)
	public String UserLogin() {
		return "userlogin";
	}
	
	@RequestMapping(value="/adminregister", method=RequestMethod.POST)
	public String AdminRegistration() {
		return "adminregister";
	}
	

}
