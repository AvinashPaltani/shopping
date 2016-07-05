package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/Admin")
	public String listProduct(Model model) {
		/*System.out.println("sfsf");*/
	model.addAttribute("product", new Product());
		model.addAttribute("list", this.productService.listProduct());
		
		for (Product p:productService.listProduct())
		{
			System.out.println("descr" +p.getDesp());
			System.out.println(p.getId());
		}
		return "Admin";
	}
	
	
	@RequestMapping(value= "/Admin/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("product") Product p){
		System.out.println("admin add");
		
			System.out.println(p.getId());
			if(p.getId() == 0){
				//new person, add it
				System.out.println("add product" +p.getId());
				this.productService.addProduct(p);
			}
			else
			{
				System.out.println("edit product" +p.getId());
				//existing person, call update
				this.productService.updatePerson(p);
			}
			//existing person, call update
			
		
		return "redirect:/Admin";
		
	}
		
	
	
	@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.productService.removePerson(id);
        return "redirect:/Admin";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("product", this.productService.getPersonById(id));
        model.addAttribute("list", this.productService.listProduct());
        return "Admin";
        
	
}
}