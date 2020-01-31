package com.NVDabbewala.rest.webservices.restfulwebservices.dto;

import java.time.LocalDate;

public class StudentBillDTO {

	private String studentFirstName;
	private String studentLastName;
	private String studentBranch;	
	private LocalDate billDate;
	private double billAmount;
	private double billDueAmount;
	private boolean billPaymentStatus;
	
	public StudentBillDTO() {
	System.out.println("Inside CTOR of "+getClass().getName());
	}

	public StudentBillDTO(String studentFirstName,String studentLastName, String studentBranch, LocalDate billDate, double billAmount,
			boolean billPaymentStatus) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentBranch = studentBranch;
		this.billDate = billDate;
		this.billAmount = billAmount;
		this.billPaymentStatus = billPaymentStatus;
	}

//	For max due bill	


	public String getStudentBranch() {
		return studentBranch;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public boolean isBillPaymentStatus() {
		return billPaymentStatus;
	}

	public void setBillPaymentStatus(boolean billPaymentStatus) {
		this.billPaymentStatus = billPaymentStatus;
	}

	public double getBillDueAmount() {
		return billDueAmount;
	}

	public void setBillDueAmount(double billDueAmount) {
		this.billDueAmount = billDueAmount;
	}
	
	
}
