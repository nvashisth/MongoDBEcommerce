package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.NitinCustomer;
import com.ecommerce.repository.NitinCustomerDAO;

@RestController
@RequestMapping("nitinCustomer")
public class NitinDemoController {
	@Autowired
	private NitinCustomerDAO customerDao;
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public List<NitinCustomer> getCustomerList() {
		List<NitinCustomer> customers = customerDao.listCustomer();
		System.out.println(customers);
		return customers;
	}
	
	@RequestMapping(value = "/customer/save", method = RequestMethod.POST)
	public String createCustomer(@RequestBody NitinCustomer customer) {
		System.out.println("Nitin we got customer from UI = "+customer.getName());
		if(StringUtils.hasText(customer.getId())) {
			customerDao.updateCustomer(customer);
			return "Customer Updated";
		} else {
			customerDao.addCustomer(customer);
			return "Customer created with name = "+customer.getName();
		}
	}
}