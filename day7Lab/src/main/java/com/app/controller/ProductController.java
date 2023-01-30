package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	public ProductController() {
		System.out.println("in default ctr of"+getClass());
	}
	
	@GetMapping("/desc") // to narrow down the url otw products/desc in requestMapping
	public String showForm(Model map) {
		System.out.println("in show form");
		return "/products/show_form"; // in views write show_form.jsp
	}
	//add request handeling method to process form
	@PostMapping("/desc") // requet mapping +method
	//String keyword = requuest.getParameter("keyword");
	public String processForm(@RequestParam String keyword) {
		System.out.println("in process form"+keyword);
		return null;
	}

}
