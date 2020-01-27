package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "order")
public class Order {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer orderId;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name = "order_student_id")
	private Student orderStudentId;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name = "order_menu_id")
	private Menu orderMenuId;
	
	@ManyToOne(targetEntity = CDACBranch.class)
	private Integer orderBranchId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate orderDate;
	


	public Order(Student orderStudentId, Menu orderMenuId, Integer orderBranchId, LocalDate orderDate) {
		super();
		this.orderStudentId = orderStudentId;
		this.orderMenuId = orderMenuId;
		this.orderBranchId = orderBranchId;
		this.orderDate = orderDate;
	}


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public Integer getOrderBranchId() {
		return orderBranchId;
	}


	public void setOrderBranchId(Integer orderBranchId) {
		this.orderBranchId = orderBranchId;
	}


	public LocalDate getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}


	public Student getOrderStudentId() {
		return orderStudentId;
	}


	public void setOrderStudentId(Student orderStudentId) {
		this.orderStudentId = orderStudentId;
	}


	public Menu getOrderMenuId() {
		return orderMenuId;
	}


	public void setOrderMenuId(Menu orderMenuId) {
		this.orderMenuId = orderMenuId;
	}


	@Override
	public String toString() {
		return String.format("Order [orderId=%s, orderDate=%s]", orderId, orderDate);
	}
	
	
}
