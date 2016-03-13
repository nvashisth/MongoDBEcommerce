package com.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Document is used to denote the collection in which the data will be persisted. 
 * If it is not mentioned, the data is saved in the collection which has the same name
 *  as the Entity Class Name.
 */
@Document(collection="customer")
public class Customer {

	/**
	 * @Id maps the property annotated with it to the _id column of the collection.
	 */
	@Id
	private String customerID;
	
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String password;
	private String dateEntered;
	
	/**
	 * @DBRef is used to relate an existing entity to the current entity. However, 
	 * unlike the case with Relational Databases, if we save the host entity 
	 * it does not save the related entity. It has to be persisted separately.
	 */
	@DBRef(db="address_resident")
	private List<Address_Resident> addressResidentList = new ArrayList<Address_Resident>();
	
	@DBRef(db="card_details")
	private List<Card_Details> cardDetailsList = new ArrayList<Card_Details>();
	
	@DBRef(db="address_billing")
	private List<Address_Billing> addressBillingList = new ArrayList<Address_Billing>();
	
	/**
	 * @PersistenceConstructor is used to mark the constructor which is to be used for creating
	 * entities when fetching data from the Mongo Server.
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param email
	 * @param password
	 * @param dateEntered
	 */
	@PersistenceConstructor
	public Customer(String firstName,
			        String lastName,
			        String phone,
			        String email,
			        String password,
			        String dateEntered) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.dateEntered = dateEntered;
	}
	
	public Customer() {}


	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}


	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the addressResidentList
	 */
	public List<Address_Resident> getAddressResidentList() {
		return addressResidentList;
	}


	/**
	 * @param addressResidentList the addressResidentList to set
	 */
	public void setAddressResidentList(List<Address_Resident> addressResidentList) {
		this.addressResidentList = addressResidentList;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the cardDetailsList containing all card details associated with customer
	 */
	public List<Card_Details> getCardDetailsList() {
		return cardDetailsList;
	}


	/**
	 * @param cardDetailsList the cardDetailsList to set
	 */
	public void setCardDetailsList(List<Card_Details> cardDetailsList) {
		this.cardDetailsList = cardDetailsList;
	}


	/**
	 * @return the addressBillingList
	 */
	public List<Address_Billing> getAddressBillingList() {
		return addressBillingList;
	}


	/**
	 * @param addressBillingList the addressBillingList to set
	 */
	public void setAddressBillingList(List<Address_Billing> addressBillingList) {
		this.addressBillingList = addressBillingList;
	}


	/**
	 * @return the dateEntered
	 */
	public String getDateEntered() {
		return dateEntered;
	}


	/**
	 * @param dateEntered the dateEntered to set
	 */
	public void setDateEntered(String dateEntered) {
		this.dateEntered = dateEntered;
	}
	
	@Override
	public String toString() {
		return "Customer [customerID = "+ customerID + " ,firstName = " + firstName +
				", lastName = "+ lastName +" ,phone = "+ phone +" ,email "+ email +
				" ,password = "+ password + ", dateEntered = "+ dateEntered +
				", addressResidentList = "+ addressResidentList +", cardDetailsList "+
				cardDetailsList + ", addressBillingList " + addressBillingList +"]";
	}

}
