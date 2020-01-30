package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "orderlist")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;

//	@JsonBackReference
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "order_student_id")
	private Student orderStudentId;

//	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_menu_id")
	private Menu orderMenuId;


	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "order_date")
	private LocalDate orderDate;

	public Order() {
	}

	public Order(Student orderStudentId, Menu orderMenuId,LocalDate orderDate) {
		super();
		this.orderStudentId = orderStudentId;
		this.orderMenuId = orderMenuId;
		this.orderDate = orderDate;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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
