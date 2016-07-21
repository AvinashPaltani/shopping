package com.controller;
 
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Contact;
import com.model.LoginUser;
import com.model.Person;
import com.model.Product;
import com.model.User_Roles;
import com.service.PersonService;
import com.service.User_RolesService;






@Controller
public class UserController {
	
   //registration page
	@Autowired
	 private PersonService personService;
     
   @Autowired
   private User_RolesService user_rolesService;
	
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
	public ModelAndView product(Model m)
	{   
		int c=0;
		List<Contact> a=personService.getAllCustomer();
		for(Object o:a)
		 c++;
		m.addAttribute("Customer", c);
		ModelAndView mv=new ModelAndView("Admin");
		
	return mv;
	}
	
	@RequestMapping("/CustomerQuery")
	 public String viewContact(Model m)
	 {
	 List<Contact>l= personService.getAllCustomer();
	 m.addAttribute("customer",l);
	 return "CustomerQuery";
	 }
	//delete customer query
	@RequestMapping("/delete/{id}")
    public String removeContact(@PathVariable("id") int id){
		
        this.personService.removeQuery(id);
        return "redirect:/CustomerQuery";
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
	@RequestMapping("/About Us")
	public ModelAndView aboutus()
	{
		ModelAndView m=new ModelAndView("About Us");
		
	return m;
	}
	@RequestMapping("/Faq")
	public ModelAndView faq()
	{
		ModelAndView m=new ModelAndView("Faq");
		
	return m;
	}
	@RequestMapping("/Terms and Conditions")
	public ModelAndView tc()
	{
		ModelAndView m=new ModelAndView("Terms and Conditions");
		
	return m;
	}
	@RequestMapping("/Policy")
	public ModelAndView policy()
	{
		ModelAndView m=new ModelAndView("Policy");
		
	return m;
	}
	@RequestMapping("/Vender Code")
	public ModelAndView vendercode()
	{
		ModelAndView m=new ModelAndView("Vender Code");
		
	return m;
	}
	@RequestMapping("/Contact")
	public ModelAndView Contactus()
	{
		ModelAndView m=new ModelAndView("Contact");
		
	return m;
	}
	
	
/*	@RequestMapping("/Login")
	public ModelAndView Login()
	{
		ModelAndView m=new ModelAndView("Login");
		
	return m;
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
		 User_Roles role=new User_Roles();
		
	    personService.addPerson(p);
	    role.setId(p.getId());
		role.setUser_role("ROLE_USER");
	    user_rolesService.addRole(role);
	  
	  return "Login";
	 }
	
	//contact page
	
	@RequestMapping(value = "/addcontact")
	public String saveEmployee(@ModelAttribute("contact")Contact c,ModelMap map )
	   {
	 personService.addContact(c);
	  
	  return "Landing";
	 }
	
	// login page
	
	 @RequestMapping(value="/Login")
	 public ModelAndView loginpage(@RequestParam(value="error",required=false)String error,@RequestParam(value="logout",required=false)String logout,Model m)
	 {
	 if (error!=null)
	 {
	 m.addAttribute("error","invalid user name");
	 }
	 if(logout!=null)
	 {
	 m.addAttribute("msg","Logout");
	 }
	 /* m.addAttribute("user",u);*/
	  
	 return new ModelAndView("Login");
	 }
	 @RequestMapping(value="/Login",method=RequestMethod.POST)
	 public String logincheck(@Valid @ModelAttribute("validate") LoginUser u,BindingResult result,Model model,@RequestParam("id") int id)
	 {
	 System.out.println("id value is" +id);
	 if(result.hasErrors())
	 {
	 return "Login";
	 }
	  
	  
	 return "Login";
	 }
	
	
	 @RequestMapping("/Home")
		public ModelAndView home()
		{
			ModelAndView m=new ModelAndView("Home");
			
		return m;
		}	 
	//web flow
	 public Person initFlow(){
			return new Person();
		}
	 
	 @RequestMapping("/AddCart")
	 public String Order() {
          return "redirect:/memberShip";
    }
	 
	
	}
	 
	 
	 
	

