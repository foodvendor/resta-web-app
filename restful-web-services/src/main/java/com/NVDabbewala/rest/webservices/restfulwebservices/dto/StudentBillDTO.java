package com.NVDabbewala.rest.webservices.restfulwebservices.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentBillDTO {

	private String studentFirstName;
	private String studentLastName;
	private String studentBranch;	
	private LocalDate billDate;
	private double billAmount;
	private double billDueAmount;
	private boolean billPaymentStatus;
	
	
}
