package com.NVDabbewala.rest.webservices.restfulwebservices.utils;


public class MenuSelect {

	public static Enum getMenu(String menuType) {
		MenuList menu = null;
		String option = null;

		switch (menuType) {
		case "REGULAR":
//			option = MenuList.REGULAR.toString();
			menu = MenuList.REGULAR;
			System.out.println(menu);
			break;
		case "HALF":
//			option = MenuList.HALF.toString();
			menu = MenuList.HALF;
			break;
		case "SPECIAL":
			menu = MenuList.REGULAR;
			break;
		}

		return menu;
	}

}
