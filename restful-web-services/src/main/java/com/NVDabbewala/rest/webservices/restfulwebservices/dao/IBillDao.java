package com.NVDabbewala.rest.webservices.restfulwebservices.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Bill;

@Repository
public interface IBillDao extends JpaRepository<Bill,Integer>{
	@Query("select sum(b.billAmount) from Bill b INNER JOIN b.studentId s where s.studentId = :studId ")
	public double calculateBill(@Param("studId") Integer studentId );
}