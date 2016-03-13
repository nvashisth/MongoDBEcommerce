package com.ecommerce.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.Address_Billing;
import com.ecommerce.entity.Customer;
import com.ecommerce.repository.Address_BillingRepo;


@Repository
@Service
public class AddressBillingService {
	
	/*@Autowired
	private Address_BillingRepo address_billing_repository;
	
	public List<Address_Billing> getAllAddress() {
		List<Address_Billing> addressBillingList = new ArrayList<Address_Billing>();
		Iterator<Address_Billing> itr = address_billing_repository.findAll().iterator();
		while(itr.hasNext())
			addressBillingList.add(itr.next());
		return addressBillingList;
	}
	
	public void create(Address_Billing obj) {
		address_billing_repository.save(obj);
	}*/
	

}
