package com.NVDabbewala.rest.webservices.restfulwebservices.dao;

import org.springframework.stereotype.Repository;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Menu;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IMenuDao extends JpaRepository<Menu,Integer> {

}
