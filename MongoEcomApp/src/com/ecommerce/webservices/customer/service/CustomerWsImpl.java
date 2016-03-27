package com.ecommerce.webservices.customer.service;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;

import org.springframework.stereotype.Repository;

import com.ecommerce.webservices_api.customer.api.service.CustomerWs;
import com.ecommerce.entity.Customer;

/**
 * Class implementing the CustomerWs interface.
 * 
 * @author Nitin Vashisth
 * 
 */
@Repository
public class CustomerWsImpl implements CustomerWs {

	@Inject
	private CustomerService customerService;

	@Override
	public Customer getCustomer(String customerID) {
		return customerService.getCustomer(customerID);
	}

	@Override
	public void createCustomer(Customer customer) {
		customerService.createCustomer(customer);
	}

	@Override
	public void updateCustomer(String customerId, Customer customer) {
		customerService.updateCustomer(customerId, customer);
	}

	@Override
	public void deleteCustomer(String customerId) {
		customerService.deleteCustomer(customerId);
	}

	@Override
	@WebMethod
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

}
