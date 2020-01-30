package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable
public class Address implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@Column(name = "society_name",unique = true)
	String societyName;
	@Column(name = "area")
	String societyArea;
	
	public Address() {
	System.out.println("Inside CTOR of "+getClass().getName());
	}
	public Address(String societyName, String societyArea) {
		super();
		this.societyName = societyName;
		this.societyArea = societyArea;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getSocietyArea() {
		return societyArea;
	}

	public void setSocietyArea(String societyArea) {
		this.societyArea = societyArea;
	}

	@Override
	public String toString() {
		return String.format("Address [societyName=%s, societyArea=%s]", societyName, societyArea);
	}
	
	
	
}
