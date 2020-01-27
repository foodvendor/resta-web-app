package com.NVDabbewala.rest.webservices.restfulwebservices.service;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.NVDabbewala.rest.webservices.restfulwebservices.dao.BranchDao;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Address;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.CDACBranch;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;

@Component
public class BranchDaoCommandLineRunner implements CommandLineRunner {

	private static final Logger logger=LoggerFactory.getLogger(BranchDaoCommandLineRunner.class);
	@Autowired
	BranchDao branchDao;
	@Override
	public void run(String... args) throws Exception {
		
		CDACBranch branch=new CDACBranch("DAC", LocalDate.parse("2019-08-12",DateTimeFormatter.ofPattern("yyyy-MM-dd")), LocalDate.parse("2020-02-01",DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//		CDACBranch branch=new CDACBranch("DAC");
		System.out.println("Branch is "+branch);
		Address addr=new Address("Priyadarshini", "Panchawati");
		System.out.println("Address is "+addr);
		Student student=new Student("Kaustubh","kaustubh@gmail.com",23,"Male","kaustubh123",addr);
		System.out.println("Student is "+student);
		ArrayList<Student> list=new ArrayList<>();
		list.add(student);
		branch.setStudentList(list);
		long insert=branchDao.insertBranch(branch);
//		logger.info("New date added "+LocalDate.parse("2019-08-12",DateTimeFormatter.ofPattern("yyyy-MM-dd"))+" "+LocalDate.parse("2020-02-01",DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		logger.info("New branch added "+branch);
		
	}

}
