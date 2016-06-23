package com.controller;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.dao.UserDao;
import com.model.Person;
import com.service.PersonServiceImp;

@Controller
public class UserController {
	
	@Autowired
	UserDao userDao;
	@Autowired
	 private PersonServiceImp personService;
	
	@RequestMapping(value={"/","/Landing"})
	public ModelAndView homepage()
	{
		ModelAndView m=new ModelAndView("Landing");
		
	return m;
		
	}
	@RequestMapping("/success")
	public ModelAndView success()
	{
		ModelAndView m=new ModelAndView("success");
		
	return m;
		
	}
	@RequestMapping("/Fail")
	public ModelAndView homepage1()
	{
		ModelAndView m=new ModelAndView("Fail");
		
	return m;
		
	}
	@RequestMapping("/index")
	public ModelAndView Login()
	{
		ModelAndView m=new ModelAndView("index");
		
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
	
	@RequestMapping("/Registration")
	public String Registeration(Model m)
	{
		Person p=new Person();
		m.addAttribute("p",p);
		
		
	return "Registration";
	
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("register")Person p )
	   {
	 personService.addPerson(p);
	  
	  return "index";
	 }
	
	

	
}
