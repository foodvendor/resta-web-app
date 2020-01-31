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
import com.NVDabbewala.rest.webservices.restfulwebservices.utils.ErrorMessage;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StudentController {

	@Autowired
	IAuthentication studentService;
	
	@PostMapping(path="/register",consumes = "application/json",produces="application/json")
	public ResponseEntity<?> registerStudent(@RequestBody Student studentRecord){
		ErrorMessage newMessage=new ErrorMessage();
		try {
			String temp=studentService.registerUser(studentRecord);
			
			newMessage.setMessageType("Success");
			newMessage.setMessageDescription(temp);
			return new ResponseEntity<>(newMessage,HttpStatus.OK);
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
			return new ResponseEntity<Student>(resultStudent,HttpStatus.OK);
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
