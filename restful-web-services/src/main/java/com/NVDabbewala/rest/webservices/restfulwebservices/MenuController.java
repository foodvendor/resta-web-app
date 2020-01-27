package com.NVDabbewala.rest.webservices.restfulwebservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Menu;
import com.NVDabbewala.rest.webservices.restfulwebservices.service.MenuService;
import com.NVDabbewala.rest.webservices.restfulwebservices.utils.MenuSelect;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/menu")
public class MenuController {

	@Autowired
	MenuService service;
	
	@GetMapping(path = "/type/{name}",produces = "application/json")
	public ResponseEntity<?> showMenu(@PathVariable String name){
		System.out.println("Inside showMenu "+MenuSelect.getMenu(name));
		return new ResponseEntity<Enum>(MenuSelect.getMenu(name),HttpStatus.OK);
	}

	@PostMapping(path = "/type/{name}",produces = "application/json")
	public ResponseEntity<?> addMenu(@PathVariable String name){
		System.out.println("Inside showMenu "+MenuSelect.getMenu(name));
		return new ResponseEntity<Menu>(service.addMenu(MenuSelect.getMenu(name)),HttpStatus.OK);
	}
}
