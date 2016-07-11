package com.controller;
 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.model.Contact;
import com.model.Person;
import com.model.Product;
import com.service.PersonService;
import com.service.PersonServiceImp;

@Controller
public class UserController {
	
   //registration page
	@Autowired
	 private PersonService personService;
     
     
	
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
	
	@RequestMapping("/Admin")
	public ModelAndView product()
	{
		ModelAndView m=new ModelAndView("Admin");
		
	return m;
		
	}
	@RequestMapping("/Category")
	public ModelAndView categroy()
	{
		ModelAndView m=new ModelAndView("Category");
		
	return m;
		
	}
	@RequestMapping("/Fail")
	public ModelAndView homepage1()
	{
		ModelAndView m=new ModelAndView("Fail");
		
	return m;
	}
	@RequestMapping("/Contact")
	public ModelAndView Contactus()
	{
		ModelAndView m=new ModelAndView("Contact");
		
	return m;
	}
	
	
	@RequestMapping("/Login")
	public ModelAndView Login()
	{
		ModelAndView m=new ModelAndView("Login");
		
	return m;
		
	
	}
	
	/*@RequestMapping("/isValidUser")
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
	*/
	@RequestMapping(value="/Registration")
	public ModelAndView Registeration(Model m)
	{	
	return new ModelAndView("Registration");
	
	}
	
	
	@RequestMapping(value = "/add")
	public String saveEmployee(@ModelAttribute("register")Person p,ModelMap map )
	   {
	 personService.addPerson(p);
	  
	  return "Login";
	 }
	//contact
	@RequestMapping(value = "/addcontact")
	public String saveEmployee(@ModelAttribute("contact")Contact c,ModelMap map )
	   {
	 personService.addContact(c);
	  
	  return "Landing";
	 }
	
	
	
	
	/*@RequestMapping(value="/Login",method=RequestMethod.POST)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	{
	ModelAndView model = new ModelAndView("login");
	Person person = new Person();
	model.addObject("Person",person);
	
	        return model;
		    }*/
		    @RequestMapping(value="/Login",method=RequestMethod.POST)
	    public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("Person")Person person)	
	    {
		        ModelAndView model= null;
		        
		         personService.isValidUser(person.getEmail(), person.getPassword());
		           /* if(isValidUser)
		            {	
	                System.out.println("User Login Successful");
		                request.setAttribute("loggedInUser", person.getEmail());
	
	                model = new ModelAndView("welcome");	
	            }
		            else
		            {
		                model = new ModelAndView("Login");	
	                    model.addObject("Person", person);
		                request.setAttribute("message", "Invalid credentials!!");
		            }
		        }
	
	        catch(Exception e)
		        {
		            e.printStackTrace();
		        }*/

	 		        return model;
	
	    }
		    
		   
}
