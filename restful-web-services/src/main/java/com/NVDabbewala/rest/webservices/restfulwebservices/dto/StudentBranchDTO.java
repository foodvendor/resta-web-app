package com.NVDabbewala.rest.webservices.restfulwebservices.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentBranchDTO {

	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private LocalDate userDoB;
	private String userGender;

	private String branchName;

}
