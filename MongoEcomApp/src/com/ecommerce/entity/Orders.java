package com.ecommerce.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Class representing the customer collection in mongoDb.
 * 
 * @author Nitin Vashisth
 * 
 */
@Document(collection = "orders")
public class Orders {

	@Id
	private String orderID;
	
	private String customerID;
	private String orderNumber;
	//TODO- WILL IMPLEMENT LATER
	
}
