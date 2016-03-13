package com.ecommerce.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.NitinCustomer;
import com.ecommerce.repository.NitinCustomerDAO;

@Repository
public class NitinCustomerDAOImpl implements NitinCustomerDAO{
	@Autowired
	private MongoTemplate mongoTemplate;
	public static final String COLLECTION_NAME = "nitin_customer";
	public void addCustomer(NitinCustomer customer) {
		if (!mongoTemplate.collectionExists(NitinCustomer.class)) {
			mongoTemplate.createCollection(NitinCustomer.class);
		}
		customer.setId(UUID.randomUUID().toString());
		mongoTemplate.insert(customer, COLLECTION_NAME);
	}
	public List<NitinCustomer> listCustomer() {
		return mongoTemplate.findAll(NitinCustomer.class, COLLECTION_NAME);
	}
	public void deleteCustomer(NitinCustomer customer) {
		mongoTemplate.remove(customer, COLLECTION_NAME);
	}
	public void updateCustomer(NitinCustomer customer) {
		mongoTemplate.insert(customer, COLLECTION_NAME);
	}
}

