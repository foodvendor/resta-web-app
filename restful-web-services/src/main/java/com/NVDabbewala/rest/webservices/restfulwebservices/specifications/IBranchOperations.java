package com.NVDabbewala.rest.webservices.restfulwebservices.specifications;

import java.util.List;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.CDACBranch;

public interface IBranchOperations {

	List<String> getAllBranches();
	String addStudent(int studentId,int branchId);
}
