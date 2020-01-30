package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "menu")
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer menuId;

	@Column
	private Integer chapati;

	@Column
	private String sabji;
	@Column
	private String rice;
	@Column
	private String dal;
	@Column(unique = true)
	private String salad;
	@Column(name = "sweet_dish", unique = true)
	private String sweetDish;
	@Column
	private String chatani;
	@Column
	private String pickle;

//	@JsonManagedReference
	@JsonIgnore
	@OneToMany(mappedBy = "orderMenuId", orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Order> orderList;

	public Menu(Integer chapati, String sabji, String rice, String dal, String salad, String sweetDish, String chatani,
			String pickle) {
		super();
		this.chapati = chapati;
		this.sabji = sabji;
		this.rice = rice;
		this.dal = dal;
		this.salad = salad;
		this.sweetDish = sweetDish;
		this.chatani = chatani;
		this.pickle = pickle;
	}

	public Menu() {
		System.out.println("Inside default CTOR of " + getClass().getName());
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public Integer getChapati() {
		return chapati;
	}

	public void setChapati(Integer chapati) {
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

	public String getSalad() {
		return salad;
	}

	public void setSalad(String salad) {
		this.salad = salad;
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

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return String.format(
				"Menu [menuId=%s, chapati=%s, sabji=%s, rice=%s, dal=%s, salad=%s, sweetDish=%s, chatani=%s, pickle=%s]",
				menuId, chapati, sabji, rice, dal, salad, sweetDish, chatani, pickle);
	}

}
