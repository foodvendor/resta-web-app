package com.NVDabbewala.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

//	@RequestMapping(method = RequestMethod.GET,path = "/hello")
	@GetMapping(path = "/hello")
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping(path = "/helloBean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World!!!");
	}

	@GetMapping(path = "/helloBean/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello %s!!!", name));
	}

}
