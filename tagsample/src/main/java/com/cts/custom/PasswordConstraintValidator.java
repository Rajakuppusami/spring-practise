package com.cts.custom;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password,String> 
{

	public boolean isValid(String s, ConstraintValidatorContext cvc) 
	{
		System.out.println("password value  "+s);
		boolean result=s.contains("cts");
		return result;
	}
}