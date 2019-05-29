package com.cts.model;

import com.cts.custom.Dob;

public class User {

	private String name;
	@Dob(message="date must be in dd-MM-yyyy")
	private String dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
