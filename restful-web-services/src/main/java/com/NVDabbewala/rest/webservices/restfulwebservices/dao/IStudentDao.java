package com.NVDabbewala.rest.webservices.restfulwebservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;

@Repository
public interface IStudentDao extends JpaRepository<Student, Integer> {
	
	@Query("select s from Student s where s.studentEmail =:email and s.studentPassword =:password")
	public Student findStudentByEmailAndPassword(@Param("email")String email,@Param("password")String password);
//	public boolean updateCDACBranch();
	
}
