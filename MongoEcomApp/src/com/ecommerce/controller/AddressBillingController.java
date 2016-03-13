package com.ecommerce.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.Address_Billing;
import com.ecommerce.service.AddressBillingService;

@RestController
@RequestMapping("addressBilling")
public class AddressBillingController {

	@Autowired
	private AddressBillingService addressBillingService;

	/**
	 * Returns the list of all customers
	 * 
	 * @return List<Address_Billing>
	 */
	/*@RequestMapping(value = "allAddress", method = RequestMethod.GET)
	public List<Address_Billing> getAll() {
		return addressBillingService.getAllAddress();
	}

	@RequestMapping(value = "create")
	public Address_Billing createAddress() {
		Address_Billing address = new Address_Billing("Kansas", "Missisippi",
				"Missouri", "552210", "USA");
		addressBillingService.create(address);
		return address;
	}*/
}
