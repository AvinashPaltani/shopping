package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.BufferedOutputStream;
import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
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
   private Path path;
   static int data=1; 
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
	public String addPerson(@ModelAttribute("product") Product p,HttpServletRequest request){
		System.out.println("admin add");
	
		productService.addProduct(p);
				/* MultipartFile image = p.getImage();
			       String rootDirectory = request.getSession().getServletContext().getRealPath("/");
			       path = Paths.get(rootDirectory + "/resources/images/" + p.getId() + ".jpg");
			   System.out.println(path);
			       if(image != null && !image.isEmpty()){
			           try {
			        	   image.transferTo(new File(path.toString()));
			               
			           } catch (Exception ex){
			               ex.printStackTrace();
			               throw new RuntimeException("Product image saving failed", ex);
			           }
			       }*/
				      
		ServletContext context=request.getServletContext();
		String path=context.getRealPath("/resources/pics/"+p.getId()+".jpg");
		System.out.println("Path= "+path);	
		System.out.println("Filename = "+p.getImage().getOriginalFilename());		 
		File f=new File(path);		 
		if(!p.getImage().isEmpty())
		 {
		try 
		{
		//filename=p.getImagePath().getOriginalFilename();
		byte[] bytes=p.getImage().getBytes();
		BufferedOutputStream bs=new BufferedOutputStream(new FileOutputStream(f));
		bs.write(bytes);
		bs.close();
		System.out.println("Image uploaded");		
		//productService.addProduct(p);
		System.out.println("DataInserted");
		}
		catch(Exception ex)
		  {
		    System.out.println(ex.getMessage());          }    
       	 }
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
    Product product;
    @RequestMapping("/Details/{pname}")
    public ModelAndView Product_Method2(@PathVariable("pname") String name,@ModelAttribute("product") Product product)
    {
    	
        System.out.println("product id is" +product.getId());
       
                  List<Product> retrive=new ArrayList<Product>();
                  //ProductService service=new ProductService();
                 
                  List<Product> list= productService.listProduct();
                 System.out.println(list);
               //  productService.getPersonById(p1.getId());
                 
                 Iterator<Product> i=list.iterator();
                  while(i.hasNext())
                  {
                                 Product p=(Product)i.next();
                                 System.out.println("json id us" +product.getId());
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
     
 //Brand details mapping
    
    @RequestMapping("/Branddetails/{pname}")
    public ModelAndView Product_Method(@PathVariable("pname") String name)
    {
                 
                  List<Product> retrive=new ArrayList<Product>();
                  //ProductService service=new ProductService();
                 
                  List<Product> list= productService.listProduct();
                 System.out.println(list);
                 Iterator<Product> i=list.iterator();
                  while(i.hasNext())
                  {
                                 Product p=(Product)i.next();
                                 if(p.getBrand().equals(name))
                                 {
                               
     System.out.println("category is" +p.getBrand());
                               
     System.out.println("name" +name);
                               
     retrive.add(p);
                                 }
                                
                  }
                  String json = new Gson().toJson(retrive);
                  System.out.println(json);
                  
                  ModelAndView mv=new ModelAndView("Branddetails");        
                  mv.addObject("access",json);
                  
                 
                  return mv;

    }
    @RequestMapping("/logout")
    public String logout()
    {
    	return "logout";
    }
}