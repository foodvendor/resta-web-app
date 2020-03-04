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

import com.NVDabbewala.rest.webservices.restfulwebservices.admin.dao.IAdminStudentDAO;
import com.NVDabbewala.rest.webservices.restfulwebservices.dto.StudentBranchDTO;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;
import com.NVDabbewala.rest.webservices.restfulwebservices.utils.ErrorMessage;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/admin")
public class AdminStudentController {

	@Autowired
	IAdminStudentDAO dao;

	@GetMapping(path = "/students/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStudentRecords(@PathVariable Integer id) {
//		List<Student> studentList=dao.findAll();
		List<StudentBranchDTO> studentList=dao.fetchAllStudentsByBranchId(id);
		if(studentList.isEmpty()) {
			return new ResponseEntity<>(new ErrorMessage("Error", "No record found by ID "+id),HttpStatus.NOT_FOUND);
		}
		System.out.println("Student list is "+studentList);
		return new ResponseEntity<>(studentList, HttpStatus.OK);
//		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(path = "/students/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllStudents()
	{
		List<Student> allStudents=dao.findAll();
		if(allStudents.isEmpty())
		{
			return new ResponseEntity<>(new ErrorMessage("Error", "No record found"),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(allStudents, HttpStatus.OK);
	}
}
