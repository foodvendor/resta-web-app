package com.NVDabbewala.rest.webservices.restfulwebservices.utils;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MenuList {

	REGULAR(), HALF(4), SPECIAL("Paneer", "Pulao", "Shira","Chinese");

	private int chapati;
	private String sabji;
	private String rice;
	private String dal;
	private String salad;
	private String sweetDish;
	private String chatani;
	private String pickle;

	private MenuList() {
		this.chapati = 6;
		this.sabji = "Peas";
		this.rice = "Plain";
		this.dal = "Regular";
		this.salad = "Normal";
		this.chatani = "Coconut";
		this.pickle = "Mango";
	}

	private MenuList(int chapati) {
		this();
		this.chapati = chapati;
	}

	private MenuList(String sabji, String rice, String sweetDish,String salad) {
		this();
		this.sabji = sabji;
		this.rice = rice;
		this.sweetDish = sweetDish;
		this.salad=salad;
	}

	public int getChapati() {
		return chapati;
	}

	public void setChapati(int chapati) {
		this.chapati = chapati;
	}

	public String getSabji() {
		return sabji;
	}

	public void setSabji(String sabji) {
		this.sabji = sabji;
	}

	public String getRice() {
		return rice;
	}

	public void setRice(String rice) {
		this.rice = rice;
	}

	public String getDal() {
		return dal;
	}

	public void setDal(String dal) {
		this.dal = dal;
	}

	public String getSweetDish() {
		return sweetDish;
	}

	public void setSweetDish(String sweetDish) {
		this.sweetDish = sweetDish;
	}

	public String getChatani() {
		return chatani;
	}

	public void setChatani(String chatani) {
		this.chatani = chatani;
	}

	public String getPickle() {
		return pickle;
	}

	public void setPickle(String pickle) {
		this.pickle = pickle;
	}

	
	public String getSalad() {
		return salad;
	}

	public void setSalad(String salad) {
		this.salad = salad;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Menu [Chapati=%d,Sabji=%s,Rice=%s,Dal=%s,Chatani=%s,Pickle=%s]", chapati, sabji, rice,
				dal, chatani, pickle);
	}

}
