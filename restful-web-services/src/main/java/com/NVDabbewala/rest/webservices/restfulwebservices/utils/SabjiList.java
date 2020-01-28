package com.NVDabbewala.rest.webservices.restfulwebservices.utils;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SabjiList {

	MONDAY("Paneer Mutter", "Tomato"), TUESDAY("Gawar", "Bhindi"), WEDNESDAY("Ghevda", "Beans"),
	THURSDAY("Potato", "Tomato"), FRIDAY("Peas", "Matki"), SATURDAY("Mix Veg", "Fulvar");

	private String sabji1;
	private String sabji2;

	private SabjiList(String sabji1, String sabji2) {
		this.sabji1 = sabji1;
		this.sabji2 = sabji2;
	}

	public String getSabji1() {
		return sabji1;
	}

	public void setSabji1(String sabji1) {
		this.sabji1 = sabji1;
	}

	public String getSabji2() {
		return sabji2;
	}

	public void setSabji2(String sabji2) {
		this.sabji2 = sabji2;
	}
	
	public SabjiList getTodaysSabji(String weekDay) {
		System.out.println("Today is "+weekDay);
		SabjiList mySabji=SabjiList.valueOf(weekDay);
		System.out.println("Selected Sabji "+mySabji);
		return mySabji;
	}

}
