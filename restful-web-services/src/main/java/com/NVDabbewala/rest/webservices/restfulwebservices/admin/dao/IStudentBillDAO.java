package com.NVDabbewala.rest.webservices.restfulwebservices.admin.dao;

import org.springframework.stereotype.Repository;

import com.NVDabbewala.rest.webservices.restfulwebservices.dto.StudentBillDTO;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Bill;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface IStudentBillDAO extends JpaRepository<Bill, Integer> {

	@Query(value = "SELECT new com.NVDabbewala.rest.webservices.restfulwebservices.dto.StudentBillDTO(s.studentFirstName,s.studentFirstName,b2.branchName, b.billDate, b.billAmount,b.dueAmount, b.paymentStatus)"
			+ "FROM Bill b INNER JOIN b.studentId s INNER JOIN b.studentId.branchId b2 WHERE s.studentId= :studentId")
	List<StudentBillDTO> fetchAllBillsByStudentId(@Param("studentId") Integer studentId);

}
