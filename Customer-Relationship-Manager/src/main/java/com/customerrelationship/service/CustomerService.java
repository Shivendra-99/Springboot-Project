package com.customerrelationship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerrelationship.Repository.CustomerRepository;
import com.customerrelationship.model.Customer;

@Service
public class CustomerService implements CustomerInter {
	@Autowired
	CustomerRepository customer;
	
	@Override
	public Customer findById(long id)   
	{  
	  return customer.findById(id).orElse(null);
	} 
	@Override
	public Customer findByName(String name) {
		return customer.findByName(name).orElse(null);
	}
	@Override
	public long getByMaxvalue() {
		return customer.getByMaxvalue();
	}
}
