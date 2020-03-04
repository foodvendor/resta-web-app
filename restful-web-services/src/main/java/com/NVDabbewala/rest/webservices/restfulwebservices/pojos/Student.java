package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.io.Serializable;
import java.time.LocalDate;
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

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@NoArgsConstructor
@Entity
// We have included ToString.Exclude to avoid recursion
public class Student implements Serializable {

	private static final long serialVersionUID = 8890748973356051813L;

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	@Column(name = "first_name")
	private String studentFirstName;
	
	@Column(name = "last_name")
	private String studentLastName;
	
	@Column(name = "student_email",unique = true)
	private String studentEmail;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "student_dob")
	private LocalDate studentDoB;
	
	@Column(name="student_gender",length = 6)
	private String studentGender;
	
	@Column(name="student_password")
	private String studentPassword;
	
	@Column(name="user_role",length = 30)
	private String userRole="Student";
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cdac_branch_id")
	@ToString.Exclude
	private CDACBranch branchId;

	@JsonIgnore
	@OneToMany(mappedBy = "studentId",orphanRemoval = true)
	@ToString.Exclude
	private List<Bill> billList;
		
//	@JsonManagedReference
	@JsonIgnore
	@OneToMany(mappedBy = "orderStudentId",orphanRemoval = true)
	@ToString.Exclude
	private List<Order> orderList;
	
	@Embedded
	private Address address;
		
//	public Student() {
//		System.out.println("Inside default CTOR of "+getClass().getName());
//	}
//
//	public Student(String studentFirstName,String studentLastName, String studentEmail, LocalDate studentDoB, String studentGender,
//			String studentPassword, Address address) {
//		super();
//		this.studentFirstName = studentFirstName;
//		this.studentLastName = studentLastName;
//		this.studentEmail = studentEmail;
//		this.studentDoB = studentDoB;
//		this.studentGender = studentGender;
//		this.studentPassword = studentPassword;
//		this.address = address;
//	}
//
//	public Student(String studentFirstName, String studentLastName, String studentEmail, LocalDate studentDoB,
//			String studentGender, String studentPassword, String userRole, Address address) {
//		super();
//		this.studentFirstName = studentFirstName;
//		this.studentLastName = studentLastName;
//		this.studentEmail = studentEmail;
//		this.studentDoB = studentDoB;
//		this.studentGender = studentGender;
//		this.studentPassword = studentPassword;
//		this.userRole = userRole;
//		this.address = address;
//	}
//
//	public String getStudentFirstName() {
//		return studentFirstName;
//	}
//
//	public void setStudentFirstName(String studentFirstName) {
//		this.studentFirstName = studentFirstName;
//	}
//
//	public String getStudentLastName() {
//		return studentLastName;
//	}
//
//	public void setStudentLastName(String studentLastName) {
//		this.studentLastName = studentLastName;
//	}
//
//	public Integer getStudentId() {
//		return studentId;
//	}
//
//	public void setStudentId(Integer studentId) {
//		this.studentId = studentId;
//	}
//
//	
//
//	public String getStudentEmail() {
//		return studentEmail;
//	}
//
//	public void setStudentEmail(String studentEmail) {
//		this.studentEmail = studentEmail;
//	}
//
//
//
//	public String getStudentGender() {
//		return studentGender;
//	}
//
//	public void setStudentGender(String studentGender) {
//		this.studentGender = studentGender;
//	}
//
//	public String getStudentPassword() {
//		return studentPassword;
//	}
//
//	public void setStudentPassword(String studentPassword) {
//		this.studentPassword = studentPassword;
//	}
//
//	public LocalDate getStudentDoB() {
//		return studentDoB;
//	}
//
//	public void setStudentDoB(LocalDate studentDoB) {
//		this.studentDoB = studentDoB;
//	}
//
//	public CDACBranch getBranchId() {
//		return branchId;
//	}
//
//	public void setBranchId(CDACBranch branchId) {
//		this.branchId = branchId;
//	}
//	 
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//
//	public String getUserRole() {
//		return userRole;
//	}
//
//	public void setUserRole(String userRole) {
//		this.userRole = userRole;
//	}
//
//	@Override
//	public String toString() {
//		return String.format(
//				"Student [studentId=%s, studentFirstName=%s, studentFirstName=%s, studentEmail=%s, studentGender=%s, studentPassword=%s]",
//				studentId, studentFirstName,studentLastName, studentEmail, studentGender, studentPassword);
//	}
	
	
}
