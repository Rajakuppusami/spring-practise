package com.cts.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.User;



@Controller
public class MainController {
	@RequestMapping("/userform")
	public String goToEmployeePage(Model model){
		User u =new User();
		model.addAttribute("userbean",u);
		return "userform";
	}
	
	
	@RequestMapping("/adduserdetails")
	public ModelAndView adduserdetails(@Valid @ModelAttribute("userbean") User user, BindingResult br,HttpServletRequest req) throws ParseException{
		ModelAndView model =new ModelAndView();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		if(br.hasErrors()){
			model.setViewName("userform");
		}else{
			int age = Integer.parseInt((String) req.getAttribute("age")) ;
			if(age>18){
				model.setViewName("success");
				model.addObject("userbean",user);
				model.addObject("age",age);
			}else{
				model.setViewName("failure");
				model.addObject("userbean",user);
				model.addObject("age",age);
			}
		}
		return model;
	}
	
}
