package com.NVDabbewala.rest.webservices.restfulwebservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NVDabbewala.rest.webservices.restfulwebservices.dao.IBranchDao;
import com.NVDabbewala.rest.webservices.restfulwebservices.dao.IStudentDao;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.CDACBranch;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;
import com.NVDabbewala.rest.webservices.restfulwebservices.specifications.IBranchOperations;

@Service
public class BranchService implements IBranchOperations {

	@Autowired
	IBranchDao dao;

	@Autowired
	IStudentDao daoStud;
	
	@Override
	public List<String> getAllBranches() {
		// TODO Auto-generated method stub
		return dao.findByBranchList();
	}

	@Override
	public String addStudent(int studentId, int branchId) {
		System.out.printf("\n Inside addStudent student=[%d], branch=[%d]",studentId,branchId);
		CDACBranch temp=dao.findById(branchId).get();
		if(temp!=null)
		{
			System.out.println("Branch is "+temp);
			Student tempStudent=daoStud.findById(studentId).get();
			System.out.println("Student is "+tempStudent);
//			temp.setStudents(tempStudent);
			daoStud.save(tempStudent);
			return String.format("Student [%s] assigned to branch [%s]",tempStudent.getStudentName(),temp.getBranchName());
		}
		return "Something went wrong";
	}

}
