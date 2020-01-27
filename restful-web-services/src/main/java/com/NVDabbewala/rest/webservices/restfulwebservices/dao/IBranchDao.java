package com.NVDabbewala.rest.webservices.restfulwebservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.CDACBranch;


@Repository
public interface IBranchDao extends JpaRepository<CDACBranch, Integer>{

	@Query("select b.branchName from CDACBranch b")
	public List<String> findByBranchList();
		
}
