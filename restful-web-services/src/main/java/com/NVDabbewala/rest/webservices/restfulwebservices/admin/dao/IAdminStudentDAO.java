package com.NVDabbewala.rest.webservices.restfulwebservices.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.NVDabbewala.rest.webservices.restfulwebservices.dto.StudentBranchDTO;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;

@Repository
public interface IAdminStudentDAO extends JpaRepository<Student, Integer> {

	@Query(value = "SELECT new com.NVDabbewala.rest.webservices.restfulwebservices.dto.StudentBranchDTO(s.studentFirstName,s.studentLastName,s.studentEmail,s.studentDoB,s.studentGender,b.branchName)"
			+ "FROM Student s INNER JOIN s.branchId b WHERE b.branchId= :id")
	List<StudentBranchDTO> fetchAllStudentsByBranchId(@Param("id") Integer branhId);

}
