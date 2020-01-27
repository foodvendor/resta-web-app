package com.NVDabbewala.rest.webservices.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.CDACBranch;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;
import com.NVDabbewala.rest.webservices.restfulwebservices.specifications.IBranchOperations;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BranchController {

	@Autowired
	IBranchOperations branchService;

	@GetMapping(path = "/branches")
	public ResponseEntity<List<String>> getAllBranch() {

		return ResponseEntity.ok().body(branchService.getAllBranches());
	}

	@PostMapping(path = "/branches/{id}", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> setBranch(@PathVariable Integer id, @RequestBody Student student) {
		int studentId=student.getStudentId();
		System.out.printf("\n BranchId [%d],\t StudentId [%d]",id,studentId);
		String message = branchService.addStudent(studentId, id);
//		return ResponseEntity.ok().body(message);
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
}
