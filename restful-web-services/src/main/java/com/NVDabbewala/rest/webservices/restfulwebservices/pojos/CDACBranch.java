package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "cdac_branch")
public class CDACBranch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4344085783919667139L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "branch_id")
	private Integer branchId;

	@Column(name = "branch_name")
	private String branchName;

	
	@Column(name = "course_start")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate courseStart;

	
	@Column(name = "course_end")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate courseEnd;
	
	@OneToMany(mappedBy = "branchId",orphanRemoval = true)
	private List<Student> studentList; 

	@OneToMany(mappedBy = "orderBranchId",orphanRemoval = true)
	private List<Order> orderList;
	
	public CDACBranch() {
		System.out.println("Inside  default" + getClass().getName() + " CTOR");
	}
			

	public CDACBranch(String branchName, LocalDate courseStart, LocalDate courseEnd) {
		super();		
		this.branchName = branchName;
		this.courseStart = courseStart;
		this.courseEnd = courseEnd;
	}


	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public LocalDate getCourseStart() {
		return courseStart;
	}

	public void setCourseStart(LocalDate courseStart) {
		this.courseStart = courseStart;
	}

	public LocalDate getCourseEnd() {
		return courseEnd;
	}

	public void setCourseEnd(LocalDate courseEnd) {
		this.courseEnd = courseEnd;
	}
 
	
	public List<Student> getStudents() {
		return studentList;
	}


	public void setStudents(Student student) {
		this.studentList.add(student);
		student.setBranchId(this);
	}


	public List<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	
	

	public List<Order> getOrderList() {
		return orderList;
	}


	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}


	@Override
	public String toString() {
		return String.format("CDACBranch [branchId=%s, branchName=%s, courseStart=%s, courseEnd=%s]", branchId,
				branchName, courseStart, courseEnd);
	}
	
	
}
