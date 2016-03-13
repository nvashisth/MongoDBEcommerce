package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.Address_Billing;

/**
 * Address_BillingRepo interface used to create and persist
 * the Address_Billing entity in MongoDb server
 * @author Nitin Vashisth
 *
 */
public interface Address_BillingRepo extends CrudRepository<Address_Billing, String> {

}
