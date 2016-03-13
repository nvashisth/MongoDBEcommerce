package com.ecommerce.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Represents the collection address_resident in mongodb
 * @author Nitin Vashisth
 *
 */
@Document(collection="address_resident")
public class Address_Resident {
	
	 @Id
	 private String address_resId;
	 
     private String address1;
     private String address2;
     private String city;
     private String state;
     private String postalCode;
     private String country;
     
     @PersistenceConstructor
     public Address_Resident(String address1,
    		                 String address2,
    		                 String city,
    		                 String state,
    		                 String postalCode,
    		                 String country) {
    	 this.setAddress1(address1);
    	 this.setAddress2(address2);
    	 this.setCity(city);
    	 this.setState(state);
    	 this.setPostalCode(postalCode);
    	 this.setCountry(country);
     }

	/**
	 * @return the address_resId
	 */
	public String getAddress_resId() {
		return address_resId;
	}

	/**
	 * @param address_resId the address_resId to set
	 */
	public void setAddress_resId(String address_resId) {
		this.address_resId = address_resId;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
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
   	 return "Address_Resident [address1 = "+ address1 +", address2 = "+ address2+
   			 ", city = "+ city + ", state = "+ state + ", postalCode = "+ postalCode +
   			 ", country = "+ country + "]";
    }
}
