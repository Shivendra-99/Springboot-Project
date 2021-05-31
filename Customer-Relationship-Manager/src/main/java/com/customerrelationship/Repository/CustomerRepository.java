package com.customerrelationship.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.customerrelationship.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
	Optional<Customer> findById(Long id);
	Optional<Customer> findByName(String name);
	@Query(value = "SELECT max(id) FROM Customer")
	long getByMaxvalue();
}
