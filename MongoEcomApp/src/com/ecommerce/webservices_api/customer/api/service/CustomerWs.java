package com.ecommerce.webservices_api.customer.api.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.ecommerce.view.CustomerView;
import com.ecommerce.entity.Customer;

/**
 * A web service for customer.
 * @author Nitin Vashisth
 *
 */
@WebService
public interface CustomerWs {

	/**
	 * Retrieves the customer using cutomerID.
	 * @param customerID
	 * @return Customer
	 */
	@WebMethod
	public Customer getCustomer(String customerID);
	
	/**
	 * Retrieves all customer
	 * @return List<Customer>
	 */
	@WebMethod
	public List<Customer> getAllCustomer();
	
	/**
	 * Creates customer using the object
	 * @param customer
	 */
	@WebMethod
	public void createCustomer(Customer customer);
	
	/**
	 * Updates the existing customer.
	 * @param customerId customerID
	 * @param customer object used to update the customer.
	 */
	@WebMethod
	public void updateCustomer(String customerId,Customer customer);
	
	/**
	 * Removes the customer using the customer id provided.
	 * @param customerId
	 */
	@WebMethod
	public void deleteCustomer(String customerId);
}
