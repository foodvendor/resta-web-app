package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "bill")
public class Bill  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bill_id")
	private Integer billID;

	@Column(name = "bill_amount", nullable = false, scale = 2) // Scale means digits after decimal point
	private double billAmount;
	
	@Column(name = "due_amount", nullable = false, scale = 2)
	private double dueAmount;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate billDate;
	
	@Column(name = "payment_status")
	private boolean paymentStatus;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student studentId;

	public Bill(double billAmount, double dueAmount, LocalDate billDate, boolean paymentStatus, Student studentId) {
		super();
		this.billAmount = billAmount;
		this.dueAmount = dueAmount;
		this.billDate = billDate;
		this.paymentStatus = paymentStatus;
		this.studentId = studentId;
	}

	public Integer getBillID() {
		return billID;
	}

	public void setBillID(Integer billID) {
		this.billID = billID;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
//		this.studentId.setBill(this);
	}

	@Override
	public String toString() {
		return String.format("Bill [billID=%s, billAmount=%s, dueAmount=%s, billDate=%s, paymentStatus=%s]", billID,
				billAmount, dueAmount, billDate, paymentStatus);
	}
	
	
}
