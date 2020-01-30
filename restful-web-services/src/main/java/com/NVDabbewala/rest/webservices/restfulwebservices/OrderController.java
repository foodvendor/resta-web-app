package com.NVDabbewala.rest.webservices.restfulwebservices;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Order;
import com.NVDabbewala.rest.webservices.restfulwebservices.pojos.Student;
import com.NVDabbewala.rest.webservices.restfulwebservices.service.OrderServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.JSONPObject;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/order")
public class OrderController {
	@Autowired
	OrderServiceImpl service;
	
	@PostMapping(path = "/getorder", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllOrder(@RequestBody Student student){
		System.out.println(student);
		List<Order> resultOrder = service.getAllOrderByStudentId(student.getStudentId());
		
		ListIterator<Order> listIterator=resultOrder.listIterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		ObjectMapper mapper=new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		String data=null;
		try {
			data=mapper.writeValueAsString(resultOrder);
			System.out.println("My data is "+data);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return new ResponseEntity<>(data, HttpStatus.OK);
//		return ResponseEntity.ok().body(resultOrder);
//		return new ResponseEntity<JsonObjectSerializer>(HttpStatus.OK);
		return new ResponseEntity<>(resultOrder,HttpStatus.OK);
	}
	
//	public Map<Integer,Order> getAllOrders(@RequestBody Student student){
//		HashMap<Integer, Order> data=new HashMap<>();
//	}
	@PostMapping(path = "/neworder", consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public ResponseEntity<?> createOrderForStudent(@RequestBody Order order){
		System.out.println(order);		
		service.createOrderForStudentById(order);
		return new ResponseEntity<String>("Order Placed", HttpStatus.OK);
	}
}
