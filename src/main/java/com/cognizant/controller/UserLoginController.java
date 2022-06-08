package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.dao.UserDaoImpl;
import com.cognizant.model.User;

@Controller
@RequestMapping(value="/user")
public class UserLoginController {
	
	@RequestMapping(value="/login")
	public String userLogin(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "userRegisterForm";
	}
	@Autowired
	UserDaoImpl dao;
	
	
	@RequestMapping(value="/userRegistration")
	public String userRegistration(@ModelAttribute("user") User user, ModelMap map) {
		boolean status = dao.userRegister(user);
		map.addAttribute("userregstatus",status);
		return "userRegistrationResult";
	}
	
}
