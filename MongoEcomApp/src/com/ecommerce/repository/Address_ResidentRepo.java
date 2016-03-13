package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.Address_Resident;

/**
 * Address_ResidentRepo interface used to create and persist
 * the Address_Resident entity in MongoDb server
 * @author Nitin Vashisth
 *
 */
public interface Address_ResidentRepo extends CrudRepository<Address_Resident, String> {

}
