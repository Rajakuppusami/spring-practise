package com.cts.custom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DobValidation implements ConstraintValidator<Dob,String>{

	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean result=false;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date date = sdf.parse(arg0);
			Date date1 = sdf.parse("01-01-1900");
			if(date.compareTo(date1)>=0){
				result=true;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("error");
		}
		return result;
	}

}
