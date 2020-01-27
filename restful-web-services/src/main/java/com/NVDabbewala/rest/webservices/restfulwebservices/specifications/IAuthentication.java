package com.NVDabbewala.rest.webservices.restfulwebservices.specifications;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;

public interface IAuthentication {

	Student authenticateUser(String userName,String userPassword) throws Exception;
	String registerUser(Student newStudent) throws Exception;
}
