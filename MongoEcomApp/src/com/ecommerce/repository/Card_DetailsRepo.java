package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.Card_Details;

/**
 * Card_DetailsRepo interface used to create and persist
 * the Card_Details entity in MongoDb server
 * @author Nitin Vashisth
 *
 */
public interface Card_DetailsRepo extends CrudRepository<Card_Details, String> {

}
