package com.NVDabbewala.rest.webservices.restfulwebservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NVDabbewala.rest.webservices.restfulwebservices.dao.IMenuDao;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Menu;
import com.NVDabbewala.rest.webservices.restfulwebservices.specifications.IMenuOperations;
import com.NVDabbewala.rest.webservices.restfulwebservices.utils.MenuList;

@Service
public class MenuService implements IMenuOperations {

	@Autowired
	IMenuDao dao;

	Menu newMenu = new Menu();

	public Menu addMenu(Enum menuName) {
		MenuList menu = null;
		switch (menuName.name()) {
		case "REGULAR":
			menu = MenuList.REGULAR;
			break;
		case "HALF":
			menu = MenuList.HALF;
			break;
		case "SPECIAL":
			menu = MenuList.REGULAR;
		}
		newMenu.setChapati(menu.getChapati());
		newMenu.setChatani(menu.getChatani());
		newMenu.setDal(menu.getDal());
		newMenu.setPickle(menu.getPickle());
		newMenu.setRice(menu.getRice());
		newMenu.setSabji(menu.getSabji());
		newMenu.setSalad(menu.getSalad());
		newMenu.setSweetDish(menu.getSweetDish());
		return dao.save(newMenu);
	}
}
