package com.controller;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.dao.UserDao;

@Controller
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/Landing")
	public ModelAndView homepage()
	{
		ModelAndView m=new ModelAndView("Landing");
		
	return m;
		
	}
	
	@RequestMapping("/isValidUser")
	public ModelAndView showMesssage(@RequestParam(value  = "name") String name,
			@RequestParam(value = "password") String password)
	{
		System.out.println("in controller");
		
		String message;
		ModelAndView mv;
		if(userDao.isValidUser(name,password)){
			message = "Valid Credentials";
			mv = new ModelAndView("success");
		}
		else{
			message = "Invalid Credentials";
			mv = new ModelAndView("Fail");
		}
		mv.addObject("message",message);
		mv.addObject("name",name);
		return mv;
		}
	
}
