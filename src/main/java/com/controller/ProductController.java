package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.model.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/Product")
	public String listProduct(Model model) {
		/*System.out.println("sfsf");*/
	model.addAttribute("product", new Product());
		model.addAttribute("list", this.productService.listProduct());
		List<Product> a=productService.listProduct();
		
		for (Product p:a)
		{
			System.out.println("descr" +p.getDesp());
			System.out.println(p.getId());
		}
		return "Product";
	}
	
	
	@RequestMapping(value= "/Admin/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("product") Product p){
		System.out.println("admin add");
		//HttpSession s=request.getSession();
			System.out.println(p.getId());
			if(p.getId() == 0){
				//new person, add it
				System.out.println("add product" +p.getId());
				this.productService.addProduct(p);
				 /* MultipartFile file=p.getImage();
				     //  String originalfile=file.getOriginalFilename();
				        String fileloc=s.getServletContext().getRealPath("/resources/pics/");
				        System.out.println(fileloc);
				      String filename=fileloc+"\\"+p.getId()+".jpg";
				      System.out.println("filename is" +filename);
				      
				      try{
				     byte b[]=file.getBytes();
				     FileOutputStream fos=new FileOutputStream(filename);
				     fos.write(b);
				fos.close();
				System.out.println(filename);
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				      catch (Exception e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				    }*/
				      
				   
				        }
			else
			{
				System.out.println("edit product" +p.getId());
				//existing person, call update
				this.productService.updatePerson(p);
			}
			//existing person, call update
			
		
		return "redirect:/Product";
		
	}
		
	
	
	@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.productService.removePerson(id);
        return "redirect:/Product";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("product", this.productService.getPersonById(id));
        model.addAttribute("list", this.productService.listProduct());
        return "Product";
        
}
    //details mapping
    
    @RequestMapping("/Details/{pname}")
    public ModelAndView Product_Method2(@PathVariable("pname") String name)
    {
                 
                  List<Product> retrive=new ArrayList<Product>();
                  //ProductService service=new ProductService();
                 
                  List<Product> list= productService.listProduct();
                 System.out.println(list);
                 Iterator<Product> i=list.iterator();
                  while(i.hasNext())
                  {
                                 Product p=(Product)i.next();
                                 if(p.getName().equals(name))
                                 {
                               
     System.out.println("category is" +p.getName());
                               
     System.out.println("name" +name);
                               
     retrive.add(p);
                                 }
                                
                  }
                  String json = new Gson().toJson(retrive);
                  System.out.println(json);
                  
                  ModelAndView mv=new ModelAndView("Details");        
                  mv.addObject("access",json);
                  
                 
                  return mv;

    }


	
    
    
}