package com.cts.model;

import org.springframework.stereotype.Component;

@Component
public class LoginOperation {
	String username[]={"Abin","Niba"};
	String passwords[]={"abin@123","niba@123"};
	
	public boolean authenticate(String uname, String pwd)
	{
		boolean flag=false;
		
		for(int i=0;i<username.length;i++)
		{
			if(uname.equalsIgnoreCase(username[i]))
			{
				if(pwd.equalsIgnoreCase(passwords[i]))
				{
					flag=true;
					break;
				}
			}
		}
		return flag;
	}
}
