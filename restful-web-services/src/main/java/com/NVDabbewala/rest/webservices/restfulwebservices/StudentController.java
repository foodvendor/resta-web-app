package com.NVDabbewala.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;
import com.NVDabbewala.rest.webservices.restfulwebservices.specifications.IAuthentication;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StudentController {

	@Autowired
	IAuthentication studentService;
	
	@PostMapping(path="/register",consumes = "application/json",produces="application/json")
	public ResponseEntity<?> registerStudent(@RequestBody Student studentRecord){
		try {
			String temp=studentService.registerUser(studentRecord);
			return new ResponseEntity<String>(String.format("Message %s",temp ),HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Registration failed",HttpStatus.OK);
	}
	
	@PostMapping(path="/authenticate",consumes = "application/json",produces="application/json")
	public ResponseEntity<?> authenticateStudent(@RequestBody Student student){
		try {
			Student resultStudent=studentService.authenticateUser(student.getStudentEmail(), student.getStudentPassword());
			if(resultStudent!=null)
			return new ResponseEntity<String>(String.format("Message %s","Login success" ),HttpStatus.OK);
			else
			return new ResponseEntity<String>(String.format("Message %s","Invalid credentials" ),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Authentication failed",HttpStatus.OK);
	}
	
//	public String addStudent(@RequestBody Student studentRecord) {
////		return student.registerStudent(studentRecord);
//		return "";
//	}
	
	
	
}
