package poly.edu.rest.controller;

import com.fasterxml.jackson.databind.JsonNode;

import poly.edu.entity.Order;
import poly.edu.entity.Product;
import poly.edu.service.OrderService;
import poly.edu.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class OrderRestController {
	
	@Autowired
	OrderService orderService;
	 
	// nhận giới dạng json nên sử dụng requetsBody và nhận vào jsonNode
	@PostMapping()
	public Order create(@RequestBody JsonNode orderData) {
	return orderService.create(orderData);
	}
}
