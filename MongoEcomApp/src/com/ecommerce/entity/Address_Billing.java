package com.ecommerce.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents the collection address_billing in mongodb
 * @author Nitin Vashisth
 *
 */
@Document(collection="address_billing")
public class Address_Billing {
      
	@Id
	private String address_billID;
	
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	
	@PersistenceConstructor
    public Address_Billing(String address,
   		                 String city,
   		                 String state,
   		                 String postalCode,
   		                 String country) {
   	 this.setAddress(address);
   	 this.setCity(city);
   	 this.setState(state);
   	 this.setPostalCode(postalCode);
   	 this.setCountry(country);
    }


	/**
	 * @return the address_billID
	 */
	public String getAddress_billID() {
		return address_billID;
	}


	/**
	 * @param address_billID the address_billID to set
	 */
	public void setAddress_billID(String address_billID) {
		this.address_billID = address_billID;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}


	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}


	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address_Billing [address = "+ address + " ,city = "+ city + ", state = "+
	           state + " ,postalCode = "+ postalCode +" ,country = "+ country +"]";
	}
	
}
