package com.NVDabbewala.rest.webservices.restfulwebservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Order;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;

@Repository
public interface IOrderDao extends JpaRepository<Order, Integer> {

	@Query("FROM Order o INNER JOIN o.orderStudentId s INNER JOIN o.orderMenuId m  where s.studentId=:studId")
//	@Query("SELECT o.orderId FROM Order o INNER JOIN o.orderStudentId s where s.studentId=:studId")
	List<Order> getAllOrdersByStudentId(@Param("studId") int studentId);
//	List<Order> findByOrderStudentId(Student orderStudentId);
	
}
