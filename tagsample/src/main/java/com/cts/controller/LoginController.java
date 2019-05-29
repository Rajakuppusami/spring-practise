package com.cts.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.Login;
import com.cts.model.LoginOperation;

@Controller
public class LoginController {

	@Autowired
	private LoginOperation lb;

	@RequestMapping("/myLogin")
	public String setModel(Model model)
	{
		System.out.println("in set model");
		Login l=new Login();
		model.addAttribute("loginmodel", l);
		return "loginpage";
	}
	

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView control1(@Valid @ModelAttribute("loginmodel") Login l, BindingResult br)
	{
		if(br.hasErrors())
		{
			ModelAndView model = new ModelAndView();
			model.setViewName("loginpage");
			return model;
		}
		else
		{
			ModelAndView model = new ModelAndView();
			if(lb.authenticate(l.getUname(), l.getPwd()))
			{		
				model.setViewName("success");
				model.addObject("name",l.getUname());
			}
			else
			{
				model.setViewName("failure");
				model.addObject("name",l.getUname());
			}

			return model;

		}
		
	}
}
