package com.cognizant.controller;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.cognizant.model.User;


public class AuthService {
private HibernateTemplate hibernateTemplate;
	

	private AuthService() { }

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@SuppressWarnings( { "unchecked", "deprecation" } )
	public boolean findUser(String uname,String upwd) 
	{
		boolean isValidUser = false;
		String sqlQuery = "from User u where u.name=? and u.password=?";
		try {
				//List<User> userObj = (List<User>) ht.find(sqlQuery, uname, upwd);
				List<User> userObj = (List<User>) hibernateTemplate.find(sqlQuery, uname, upwd);
				
			
				if(userObj != null && userObj.size() > 0) 
				{
					isValidUser = true;
				}
			}
			catch(Exception e) 
			{
				isValidUser = false;
				e.printStackTrace();
			}
		return isValidUser;
	
	}
}
