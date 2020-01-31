package com.NVDabbewala.rest.webservices.restfulwebservices.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NVDabbewala.rest.webservices.restfulwebservices.admin.dao.IStudentBillDAO;
import com.NVDabbewala.rest.webservices.restfulwebservices.dto.StudentBillDTO;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/admin")
public class AdminStudentBillController {

	@Autowired
	IStudentBillDAO dao;
	@GetMapping(path = "/bill/{studentId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getBillDetails(@PathVariable Integer studentId){
		List<StudentBillDTO> allBills=dao.fetchAllBillsByStudentId(studentId);
		return new ResponseEntity<>(allBills,HttpStatus.OK);
	}
}
