package com.NVDabbewala.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Bill;
import com.NVDabbewala.rest.webservices.restfulwebservices.service.BillServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/menu")
public class BillController {
	
	@Autowired
	BillServiceImpl service;
	
	@PostMapping(path = "/bill",consumes = "application/json",produces = "application/json")
	public ResponseEntity<?> calculateBill(@RequestBody Bill bill){
		System.out.println(bill);
		double billAmount = service.generateBill(bill.getStudentId().getStudentId());
		System.out.println(billAmount);
		if (billAmount > 0) {
			
			return new ResponseEntity<Double>(billAmount , HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Error In generating Bill", HttpStatus.OK);
		}
	}
}
