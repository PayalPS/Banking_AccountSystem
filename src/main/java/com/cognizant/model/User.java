package com.cognizant.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User {
	public User(String firstName, String lastName, String contact,int dOB, String email, String password, String accountType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.DOB = dOB;
		this.email = email;
		this.password = password;
		this.accountType = accountType;
	}
	public User() {
		
	}
	@NotEmpty(message = "First Name is required")
	private String firstName;
	
	@NotEmpty(message = "Last Name is required")
	private String lastName;
	
	@NotEmpty(message = "Phone number is required")
	@Pattern(regexp = "^[\\d]{10}$", message = "Phone number should be 10 digits")
	private String contact;
	
	@NotEmpty(message = "Date of Birth is required")
	private int DOB;
	
	private String email;
	@NotEmpty(message = "Password is required")
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getDOB() {
		return DOB;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	private String accountNumber;
	@NotNull(message = "Must select one Option")
	private String accountType;
	
}
