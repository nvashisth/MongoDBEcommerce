package com.ecommerce.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Customer;
import com.ecommerce.repository.CustomerRepo;

/**
 * @author Nitin Vashisth
 *
 */

@Repository
@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepository;
	
	public void createCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		Iterator<Customer> itr = customerRepository.findAll().iterator();
		while(itr.hasNext())
			customers.add(itr.next());
		return customers;
	}
	
	public Customer getCustomer(String email) {
		return customerRepository.searchByName(email);
	}
	
	public void deleteCustomer(String customerID) {
		customerRepository.delete(customerID);
	}
}
