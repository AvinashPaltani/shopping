package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Category;
import com.model.Product;
import com.service.CategoryService;

@Controller
public class CategoryController {
	
	/*@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/Admin")
	public String listProduct(Model model) {
	model.addAttribute("category", new Category());
		model.addAttribute("list", this.categoryService.listCategory());
		
		for (Category c:categoryService.listCategory())
		{
			System.out.println("descr" +c.getDescription());
			System.out.println(c.getId());
		}
		return "Admin";
	}
	
	
	@RequestMapping(value= "/Admin/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("category") Category c){
		System.out.println("admin add");
		
			System.out.println(c.getId());
			if(c.getId() == 0){
				//new person, add it
				System.out.println("add category" +c.getId());
				this.categoryService.addCategory(c);
			}
			else
			{
				System.out.println("edit category" +c.getId());
				//existing person, call update
				this.categoryService.updateCategory(c);
			}
			//existing person, call update
			
		
		return "redirect:/Admin";
		
	}
		
	
	
	@RequestMapping("/remove/{id}")
    public String removeCategory(@PathVariable("id") int id){
		
        this.categoryService.removeCategory(id);
        return "redirect:/Admin";
    }
 
    @RequestMapping("/edit/{id}")
    public String editCategory(@PathVariable("id") int id, Model model){
        model.addAttribute("category", this.categoryService.getCategoryById(id));
        model.addAttribute("list", this.categoryService.listCategory());
        return "Admin";
        
	
}
*/
}
