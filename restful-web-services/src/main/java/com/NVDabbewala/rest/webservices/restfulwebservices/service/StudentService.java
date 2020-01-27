package com.NVDabbewala.rest.webservices.restfulwebservices.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.NVDabbewala.rest.webservices.restfulwebservices.dao.IStudentDao;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Address;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.CDACBranch;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;
import com.NVDabbewala.rest.webservices.restfulwebservices.specifications.IAuthentication;

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
		return dao.findStudentByEmailAndPassword(userName, userPassword);
		
	}

	@Override
	public String registerUser(Student newStudent) throws Exception {
		// TODO Auto-generated method stub
		if (newStudent == null) {
			return null;
		} else {
			Student student = new Student();
			student.setStudentName("Kaustubh");
			student.setBranchId(
					new CDACBranch("DAC", LocalDate.parse("2019-08-12", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
							LocalDate.parse("2020-02-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
			student.setStudentAge(23);
			student.setStudentEmail("kaustubh@gmail.com");
			student.setStudentGender("Male");
			student.setStudentPassword("kaustubh123");
			student.setAddress(new Address("Priyadarshini", "Panchawati"));

			dao.save(newStudent);
			return "Student registered with ID " + newStudent.getStudentId();
		}
	}
}
