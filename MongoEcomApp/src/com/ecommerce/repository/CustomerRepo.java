package com.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import com.ecommerce.entity.Customer;

/**
 * CustomerRepo interface used to create and persist
 * the Customer entity in MongoDb server
 * @author Nitin Vashisth
 *
 */
@Component
public interface CustomerRepo extends MongoRepository<Customer,String> {
	
	@Query("select cust from Customer cust where email = ?")
	public Customer searchByName(String email);

}
