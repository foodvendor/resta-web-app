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

@CrossOrigin("http://localhost:4200/") //
@RestController
public class StudentController {

	@Autowired
	IAuthentication studentService;

	ErrorMessage errorMessage = null;

	@PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> registerStudent(@RequestBody Student studentRecord) {
		errorMessage = new ErrorMessage();
		try {
			String temp = studentService.registerUser(studentRecord);

			errorMessage.setMessageType("Success");
			errorMessage.setMessageDescription(temp);
			return new ResponseEntity<>(errorMessage, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorMessage.setMessageType("Error");
			errorMessage.setMessageDescription("Something went wrong");
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Registration failed", HttpStatus.OK);
	}

	@PostMapping(path = "/authenticate", consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> authenticateStudent(@RequestBody Student student) {
		errorMessage = new ErrorMessage();
		try {
			Student resultStudent = studentService.authenticateUser(student.getStudentEmail(),
					student.getStudentPassword());
			if (resultStudent != null)
				return new ResponseEntity<Student>(resultStudent, HttpStatus.OK);
			else {
				errorMessage.setMessageType("Success");
				errorMessage.setMessageDescription("Invalid login credentials");
				return new ResponseEntity<>(errorMessage, HttpStatus.OK);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Authentication failed", HttpStatus.OK);
	}

//	public String addStudent(@RequestBody Student studentRecord) {
////		return student.registerStudent(studentRecord);
//		return "";
//	}

}
