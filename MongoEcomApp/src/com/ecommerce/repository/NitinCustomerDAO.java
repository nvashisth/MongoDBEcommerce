package com.ecommerce.repository;

import java.util.List;

import com.ecommerce.entity.NitinCustomer;

public interface NitinCustomerDAO {
	public void addCustomer(NitinCustomer customer);
	public List<NitinCustomer> listCustomer();
	public void deleteCustomer(NitinCustomer customer);
	public void updateCustomer(NitinCustomer customer);
}
