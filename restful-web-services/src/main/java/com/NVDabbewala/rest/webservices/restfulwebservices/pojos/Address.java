package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Embeddable
public class Address implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@Column(name = "city_name",unique = true)
	private String cityName;
	@Column(name = "state_name")
	private String state;
	
	public Address() {
	System.out.println("Inside CTOR of "+getClass().getName());
	}
	public Address(String cityName, String state) {
		super();
		this.cityName = cityName;
		this.state = state;
	}
	

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return String.format("Address [City=%s, State=%s]", cityName, state);
	}
	
	
	
}
