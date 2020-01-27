package com.NVDabbewala.rest.webservices.restfulwebservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NVDabbewala.rest.webservices.restfulwebservices.dao.IBillDao;

@Service
public class BillServiceImpl implements IBillService {

	@Autowired
	IBillDao dao;
	
	@Override
	public double generateBill(int studentId) {
		System.out.println(studentId+" Inside generateBill");
		return dao.calculateBill(studentId);
	}

}
