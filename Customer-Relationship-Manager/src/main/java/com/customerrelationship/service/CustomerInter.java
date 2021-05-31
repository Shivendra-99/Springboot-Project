package com.customerrelationship.service;

import com.customerrelationship.model.Customer;

public interface CustomerInter {
	Customer findById(long id);

	Customer findByName(String name);

	long getByMaxvalue();
}
