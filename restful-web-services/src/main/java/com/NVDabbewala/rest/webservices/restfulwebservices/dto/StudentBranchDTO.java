package com.NVDabbewala.rest.webservices.restfulwebservices.dto;

import java.time.LocalDate;

public class StudentBranchDTO {

	
	private String userName;
	private String userEmail;
	private Integer userAge;
	private String userGender;

	
	private String branchName;	

	public StudentBranchDTO() {
		System.out.println("Inside default CTOR of " + getClass().getName());
	}

	public StudentBranchDTO(String userName, String userEmail, Integer userAge, String userGender, String branchName) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAge = userAge;
		this.userGender = userGender;
		this.branchName = branchName;
	}

	


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}


	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


}
