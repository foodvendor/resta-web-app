package com.NVDabbewala.rest.webservices.restfulwebservices.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.NVDabbewala.rest.webservices.restfulwebservices.dao.IStudentDao;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Address;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.CDACBranch;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;
import com.NVDabbewala.rest.webservices.restfulwebservices.specifications.IAuthentication;
import com.fasterxml.jackson.databind.ObjectMapper;

import static com.NVDabbewala.rest.webservices.restfulwebservices.utils.PasswordProtect.*;

@Service
public class StudentService implements IAuthentication {

	@Autowired
	IStudentDao dao;

	@Override
	public Student authenticateUser(String userName, String userPassword) throws Exception {

		
//		  System.out.println("Username is "+userName+" Pass is "+userPassword);
//		  Student checkStudent=new Student();
//		  checkStudent.setStudentEmail(userName);
//		  checkStudent.setStudentPassword(userPassword);
//		  checkStudent.setStudentAge(null);
//		  Example<Student> studentRecord=Example.of(checkStudent,null);
//		  Optional<Student>
//		  optional=dao.findOne(studentRecord);
//		  
//		  if(optional.isPresent()) { return optional.get(); }
//		 
//		return null;
		System.out.println("Inside authenticate email="+userName+" Password = "+userPassword);
		return dao.findStudentByStudentEmailAndStudentPassword(userName, encryptPassword(userPassword));
		
	}

	@Override
	public String registerUser(Student newStudent) throws Exception {
		// TODO Auto-generated method stub
		if (newStudent == null) {
			return null;
		} else {						
			newStudent.setStudentPassword(encryptPassword(newStudent.getStudentPassword()));
			dao.save(newStudent);
			return "Student registered with ID " + newStudent.getStudentId();
		}
	}
}
