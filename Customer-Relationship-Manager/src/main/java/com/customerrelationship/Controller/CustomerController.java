 package com.customerrelationship.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.customerrelationship.Repository.CustomerRepository;
import com.customerrelationship.model.Customer;
import com.customerrelationship.service.CustomerInter;

@RestController
@RequestMapping("/rest/customer")
public class CustomerController  {
	
	@Autowired
	CustomerRepository customer;
	@Autowired
	CustomerInter cust;

	@GetMapping(value="/all")
	public List<Customer> getAll(){
		return customer.findAll();
	}
	@PostMapping(value="/load")
	public List<Customer> saveUser(@RequestBody final Customer cust){
		 customer.save(cust);
		return customer.findAll();
	}
	@GetMapping("/value/{id}")
	public Customer getCust(@PathVariable("id") long id) {
	   return cust.findById(id);
	}
	@GetMapping("/values/{name}")
	public Customer getval(@PathVariable("name") String name) {
		return cust.findByName(name);
	}
	@GetMapping("/getmax")
	public long getmax() {
		return cust.getByMaxvalue();
	}
}
