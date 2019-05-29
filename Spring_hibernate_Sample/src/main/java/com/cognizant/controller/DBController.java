package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DBController {
	@Autowired
	private AuthService authenticateService;
	
	@RequestMapping(value="/disp",method=RequestMethod.GET)
	public ModelAndView  disp(@RequestParam("value1") String i,@RequestParam("value2") String j)
	{
	
		System.out.println("inside DBController");
		ModelAndView model=null;
		boolean isValid = authenticateService.findUser(i, j);
		if(isValid)
		{
			model = new ModelAndView();
			model.setViewName("success");
		}
		
		return model;
	}
	
}
