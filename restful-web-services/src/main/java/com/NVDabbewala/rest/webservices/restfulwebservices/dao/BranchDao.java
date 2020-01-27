package com.NVDabbewala.rest.webservices.restfulwebservices.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.CDACBranch;

@Repository
@Transactional
public class BranchDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public long insertBranch(CDACBranch branch) {
		entityManager.persist(branch);
		return branch.getBranchId();
	}
}
