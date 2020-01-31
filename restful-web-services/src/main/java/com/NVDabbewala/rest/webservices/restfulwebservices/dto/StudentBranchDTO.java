package com.NVDabbewala.rest.webservices.restfulwebservices.dto;

import java.time.LocalDate;

public class StudentBranchDTO {

	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private LocalDate userDoB;
	private String userGender;

	private String branchName;

	public StudentBranchDTO() {
		System.out.println("Inside default CTOR of " + getClass().getName());
	}

	public StudentBranchDTO(String userFirstName, String userLastName, String userEmail, LocalDate userDoB,
			String userGender, String branchName) {
		super();
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userDoB = userDoB;
		this.userGender = userGender;
		this.branchName = branchName;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	
	public LocalDate getUserAge() {
		return userDoB;
	}

	public void setUserAge(LocalDate userDoB) {
		this.userDoB = userDoB;
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
