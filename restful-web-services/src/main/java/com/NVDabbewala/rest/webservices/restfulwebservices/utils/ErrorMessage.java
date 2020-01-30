package com.NVDabbewala.rest.webservices.restfulwebservices.utils;

public class ErrorMessage {

	private String messageType;
	private String messageDescription;
	public ErrorMessage() {
	System.out.println("Inside default CTOR of "+getClass().getName());
	}
	public ErrorMessage(String messageType, String messageDescription) {
		super();
		this.messageType = messageType;
		this.messageDescription = messageDescription;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageDescription() {
		return messageDescription;
	}
	public void setMessageDescription(String messageDescription) {
		this.messageDescription = messageDescription;
	}
	
}
