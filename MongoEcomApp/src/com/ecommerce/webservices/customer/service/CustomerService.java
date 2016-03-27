package com.ecommerce.webservices.customer.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.ecommerce.entity.Customer;

/**
 * Service representing the operations to be performed on customer collection in
 * mongoDb.
 * 
 * @author Nitin Vashisth
 * 
 */
@Service
public class CustomerService {

	@Autowired
	private MongoTemplate mongoTemplate;

	private static final String COLLECTION_NAME = "customer";

	public void createCustomer(Customer customer) {
		if (!mongoTemplate.collectionExists(Customer.class)) {
			mongoTemplate.createCollection(Customer.class);
		}
		customer.setId(UUID.randomUUID().toString());
		System.out.println("Creating customer = "+customer);
		mongoTemplate.insert(customer, COLLECTION_NAME);
	}

	public List<Customer> getAllCustomer() {
		return mongoTemplate.findAll(Customer.class, COLLECTION_NAME);
	}

	public void deleteCustomer(String customerId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("customerID").is(customerId));
		mongoTemplate.remove(query, COLLECTION_NAME);
	}

	public void updateCustomer(String customerId, Customer customer) {
		Query query = new Query();
		query.addCriteria(Criteria.where("customerID").is(customerId));
		// return only doc containing customerId
		query.fields().include("customerID");
		Update update = getUpdatedCustomer(customer);
		mongoTemplate.upsert(query, update, COLLECTION_NAME);
	}

	public Customer getCustomer(String customerID) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("customerID").is(customerID));
		return mongoTemplate.findOne(query, Customer.class);
	}

	/**
	 * Creates update object based on the property to be set for updation in
	 * database and is used to execute update query for db.
	 * 
	 * @param customer
	 * @return update Update object.
	 */
	private Update getUpdatedCustomer(Customer customer) {
		Update update = new Update();
		if (!StringUtils.isEmpty(customer.getFirstName())) {
			update.set("firstName", customer.getFirstName());
		}
		if (!StringUtils.isEmpty(customer.getLastName())) {
			update.set("lastName", customer.getLastName());
		}
		if (!StringUtils.isEmpty(customer.getAddress1())) {
			update.set("address1", customer.getAddress1());
		}
		if (!StringUtils.isEmpty(customer.getAddress2())) {
			update.set("address2", customer.getAddress2());
		}
		if (!StringUtils.isEmpty(customer.getCity())) {
			update.set("city", customer.getCity());
		}
		if (!StringUtils.isEmpty(customer.getState())) {
			update.set("state", customer.getState());
		}
		if (!StringUtils.isEmpty(customer.getPostalCode())) {
			update.set("postalCode", customer.getPostalCode());
		}
		if (!StringUtils.isEmpty(customer.getCountry())) {
			update.set("country", customer.getCountry());
		}
		if (!StringUtils.isEmpty(customer.getEmail())) {
			update.set("email", customer.getEmail());
		}
		if (!StringUtils.isEmpty(customer.getPassword())) {
			update.set("password", customer.getPassword());
		}
		if (!StringUtils.isEmpty(customer.getCardType())) {
			update.set("cardType", customer.getCardType());
		}
		if (!StringUtils.isEmpty(customer.getCardNumber())) {
			update.set("cardNumber", customer.getCardNumber());
		}
		if (!StringUtils.isEmpty(customer.getCardExpMon())) {
			update.set("cardExpMon", customer.getCardExpMon());
		}
		if (!StringUtils.isEmpty(customer.getCardExpYr())) {
			update.set("cardExpYr", customer.getCardExpYr());
		}
		if (!StringUtils.isEmpty(customer.getBillingAddress())) {
			update.set("billingAddress", customer.getBillingAddress());
		}
		if (!StringUtils.isEmpty(customer.getBillingCity())) {
			update.set("billingCity", customer.getBillingCity());
		}
		if (!StringUtils.isEmpty(customer.getBillingPostalCode())) {
			update.set("billingPostalCode", customer.getBillingPostalCode());
		}
		if (!StringUtils.isEmpty(customer.getShippingAddress())) {
			update.set("shippingAddress", customer.getShippingAddress());
		}
		if (!StringUtils.isEmpty(customer.getShippingCity())) {
			update.set("shippingCity", customer.getShippingCity());
		}
		if (!StringUtils.isEmpty(customer.getShippingPostalCode())) {
			update.set("shippingPostalCode", customer.getShippingPostalCode());
		}
		if (!StringUtils.isEmpty(customer.getDateEntered())) {
			update.set("dateEntered", customer.getDateEntered());
		}
		return update;
	}
}
