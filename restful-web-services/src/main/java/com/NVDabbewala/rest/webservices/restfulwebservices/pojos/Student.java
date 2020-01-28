package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = 8890748973356051813L;

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_email",unique = true)
	private String studentEmail;
	
	@Column(name = "student_age")
	private int studentAge;
	
	@Column(name="student_gender",length = 6)
	private String studentGender;
	
	@Column(name="student_password",length = 30)
	private String studentPassword;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cdac_branch_id")
	private CDACBranch branchId;

	@OneToMany(mappedBy = "studentId",orphanRemoval = true)
	private List<Bill> billList;
	
	@OneToMany(mappedBy = "orderStudentId",orphanRemoval = true)
	private List<Order> orderList;
	
	@Embedded
	private Address address;
		
	public Student() {
		System.out.println("Inside default CTOR of "+getClass().getName());
	}

	public Student(String studentName, String studentEmail, int studentAge, String studentGender,
			String studentPassword, Address address) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
		this.studentPassword = studentPassword;
		this.address = address;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public CDACBranch getBranchId() {
		return branchId;
	}

	public void setBranchId(CDACBranch branchId) {
		this.branchId = branchId;
	}
	 
	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Bill> getBillList() {
		return billList;
	}

	public void setBillList(List<Bill> billList) {
		this.billList = billList;
	}
	
	public void setBill(Bill bill) {
		this.billList.add(bill);
		bill.setStudentId(this);
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return String.format(
				"Student [studentId=%s, studentName=%s, studentEmail=%s, studentAge=%s, studentGender=%s, studentPassword=%s]",
				studentId, studentName, studentEmail, studentAge, studentGender, studentPassword);
	}
	
	
}
