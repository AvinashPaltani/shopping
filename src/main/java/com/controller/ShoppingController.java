package com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Address;
import com.model.Item;
import com.model.Shopping;
import com.model.Person;
import com.service.ProductService;


@Controller
@Component
public class ShoppingController {

	@Autowired
	private ProductService service;
	Shopping cart;


	@RequestMapping("/AddCart/{id}")
	public String ordernow(@PathVariable(value = "id") int id, ModelMap mm, HttpSession session) {
System.out.println("product id is "+id);
		if (session.getAttribute("cart") == null) {
			System.out.println("cart value is null");
			List<Item> listcart = new ArrayList();
			cart = new Shopping();

			listcart.add(new Item(this.service.getPersonById(id), 1));
			cart.setListitem(listcart);
			session.setAttribute("cart", cart);
		} else {
			System.out.println("cart value is not null");
			cart = (Shopping) session.getAttribute("cart");
			List<Item> listcart = cart.getListitem();
			Iterator i=listcart.iterator();
			while(i.hasNext())
			{
				Item f=(Item)i.next();
				System.out.println("quanity is  " +f.getQuantity());
				System.out.println("proudct id is  " +f.getP());
			}
			// using method isExisting here
			int index = isExisting(id, listcart);
			if (index == -1)
				listcart.add(new Item(this.service.getPersonById(id), 1));
			else {
				int quantity = listcart.get(index).getQuantity() + 1;
				listcart.get(index).setQuantity(quantity);
			}
			cart.setListitem(listcart);
			session.setAttribute("cart", cart);
		}
System.out.println("redirect");
		return "redirect:/memberShip"; // page name
	}

	public Shopping initFlow() {
		// System.out.println(product.getPname());
		System.out.println("Data sply to flow");
		return cart;

	}
	

	
	
	@RequestMapping(value = "/delete1/{id}")
	public String delete(@PathVariable(value = "id") int id, HttpSession session,Model m) {
		cart = (Shopping) session.getAttribute("cart");

		List<Item> listcart = (List<Item>) cart.getListitem();

		int index = isExisting(id, listcart);
		listcart.remove(index);
		cart.setListitem(listcart);

		session.setAttribute("cart", cart);
		System.out.println("delete");
	
		
	return "redirect:/memberShip";
	
	}
	
	
	public Address getaddress() {
		
		
		return new Address();

	}
	@SuppressWarnings("unchecked")
	private int isExisting(int id, List<Item> pcart) {

		for (int i = 0; i < pcart.size(); i++)

			if (pcart.get(i).getP().getId() == id)
				return i;
		return -1;
	}

}
