package poly.edu.rest.controller;

import com.fasterxml.jackson.databind.JsonNode;

import poly.edu.entity.Account;
import poly.edu.entity.Category;
import poly.edu.entity.Order;
import poly.edu.entity.Product;
import poly.edu.service.AccountService;
import poly.edu.service.CategoryService;
import poly.edu.service.OrderService;
import poly.edu.service.ProductService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("*")
@RestController
@RequestMapping("/rest/accounts")
public class AccountRestController {
	
	@Autowired
	AccountService accountService;
	 
	@GetMapping
	public List<Account> getAccounts(@RequestParam("admin")Optional<Boolean> admin){
		  if(admin.orElse(false)) {
			  return accountService.getAdminisstrators();
		  }
		  return accountService.findAll();
	  }
}
