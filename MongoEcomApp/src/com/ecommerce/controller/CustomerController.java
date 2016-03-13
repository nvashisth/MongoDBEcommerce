package com.ecommerce.controller;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Address_Billing;
import com.ecommerce.entity.Address_Resident;
import com.ecommerce.entity.Card_Details;
import com.ecommerce.entity.Customer;
import com.ecommerce.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Inject
	private CustomerService customerService;
	
	/**
	 * Creates the customer in database
	 * @param customer
	 */
	/*@RequestMapping(value = "create/{customer}", method = RequestMethod.POST)
	/*public void create(@PathVariable("customer") Customer customer) {
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public void create() {
		Customer tempCustomer = new Customer("Karine-Santeramo", "Prade", "22336699", "karine.santeramo-prade@alstom.com", "123456", "10-march-2009");
		Address_Resident address_res = new Address_Resident("Agora1", "Room-1", "Montpelliar", "Paris", "85241", "France");
		tempCustomer.setAddressResidentList(Arrays.asList(address_res));
		Card_Details cardDetails = new Card_Details(Card_Details.CardTypes.credit_card, "4704561658791478", "Guilliame Tourress", (byte)01, (byte)2020, (byte)599);
		tempCustomer.setCardDetailsList(Arrays.asList(cardDetails));
		Address_Billing address_bill = new Address_Billing("Alstom", "Montepelliar", "Paris", "85241", "France");
		tempCustomer.setAddressBillingList(Arrays.asList(address_bill));
		//customer = tempCustomer;
		System.out.println(tempCustomer);
		customerService.createCustomer(tempCustomer);
	}*/
	
	/**
	 * Returns the customer object corresponding to customerID
	 * @param customerID
	 * @return the customer object related to the customerID
	 */
	/*@RequestMapping(value = "customer/{email}", method = RequestMethod.GET)
	public Customer get(@PathVariable("email") String email) {
		return customerService.getCustomer(email);
	}*/
	
	/**
	 * Returns the list of all customers
	 * @return List<Customer>
	 */
	/*@RequestMapping(value = "allCustomer", method = RequestMethod.GET)
	public List<Customer> getAll() {
		return customerService.getAllCustomers();
	}*/
	
	/**
	 * Returns the name of customer
	 * @param customerID
	 * @return the full name of customer
	 */
	/*@RequestMapping(value = "customerName/{email}", method = RequestMethod.GET)
	public String getName(@PathVariable("email") String email) {
		Customer customer = customerService.getCustomer(email);
		return customer.getFirstName() + " " + customer.getLastName();
	}*/
}
