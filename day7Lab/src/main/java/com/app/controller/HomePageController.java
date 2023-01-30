package com.app.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //--> MANDATORY-->spring bean containing request handeling logic(PL) 
public class HomePageController {
	public HomePageController() {
		System.out.println("in ctor of "+getClass());
	}
	//add req handling method to deliver index page
	@RequestMapping("/")
	public String showHomePage(Model map)
	{
		System.out.println("in show home page"+map);
		//API of o.s.ui.Model--public Model addattribute(String nm, Object val)
		map.addAttribute("server_date",new Date());
		return "/index";//Handler rets LVN(logical view name) --> D.S(dispatcher servlet) --> V.R (ViewResolver) --> AVN : /WEB-INF/views/index.jsp
	}

}
