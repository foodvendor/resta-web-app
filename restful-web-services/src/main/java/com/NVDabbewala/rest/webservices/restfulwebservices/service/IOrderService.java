package com.NVDabbewala.rest.webservices.restfulwebservices.service;

import java.util.List;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Order;

public interface IOrderService {
	List<Order> getAllOrderByStudentId(int studentId);

	boolean createOrderForStudentById(Order order);
}
