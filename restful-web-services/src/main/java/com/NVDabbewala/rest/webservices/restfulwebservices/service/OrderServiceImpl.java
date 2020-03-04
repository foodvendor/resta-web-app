package com.NVDabbewala.rest.webservices.restfulwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NVDabbewala.rest.webservices.restfulwebservices.dao.IOrderDao;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Order;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	IOrderDao dao;
	
	@Override
	public List<Order> getAllOrderByStudentId(Integer studentId) {
		System.out.println("Student deatails are "+studentId);
		return dao.getAllOrdersByStudentId(studentId);
//		return null;
//		return dao.findByOrderStudentId(studentId);
	}

	@Override
	public boolean createOrderForStudentById(Order order) {
		dao.save(order);
		return true;
	}

}
