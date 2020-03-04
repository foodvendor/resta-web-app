package com.NVDabbewala.rest.webservices.restfulwebservices.service;

import java.util.List;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Order;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;

public interface IOrderService {
	List<Order> getAllOrderByStudentId(Integer studentId);

	boolean createOrderForStudentById(Order order);
}
