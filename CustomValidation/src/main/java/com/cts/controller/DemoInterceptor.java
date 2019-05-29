package com.cts.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class DemoInterceptor implements HandlerInterceptor{
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		

	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("1. pre handle");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date dob = sdf.parse(arg0.getParameter("dob"));
		sdf=new SimpleDateFormat("yyyy");
		int age = 2019-Integer.parseInt(sdf.format(dob));
		System.out.println(age);
		arg0.setAttribute("age", age);
		return true;
	}

}
