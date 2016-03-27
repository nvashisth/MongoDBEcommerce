package com.ecommerce.webservices_api.customer.api.view;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Class representing the customer collection in mongoDb.
 * 
 * @author Nitin Vashisth
 * 
 */
@Document(collection = "customer")
public class Customer {

	public enum CardType {
		CreditCard, DebitCard
	}

	@Id
	private String id;

	private String customerID;
	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String email;
	private String password;
	private CardType cardType;
	private String cardNumber;
	private String cardExpMon;
	private String cardExpYr;
	private String billingAddress;
	private String billingCity;
	private String billingPostalCode;
	private String shippingAddress;
	private String shippingCity;
	private String shippingPostalCode;
	private Date dateEntered;

	public Customer() {
	}

	public Customer(String customerId, String firstName, String lastName,
			String address1, String address2, String city, String state,
			String postalCode, String country, String email, String password,
			CardType cardType, String cardNumber, String cardExpMon,
			String cardExpYr, String billingAddress, String billingCity,
			String billingPostalCode, String shippingAddress,
			String shippingCity, String shippingPostalCode, Date dateEntered) {

		this.setCustomerID(customerId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress1(address1);
		this.setAddress2(address2);
		this.setCity(city);
		this.setState(state);
		this.setPostalCode(postalCode);
		this.setCountry(country);
		this.setEmail(email);
		this.setPassword(password);
		this.setCardType(cardType);
		this.setCardNumber(cardNumber);
		this.setCardExpMon(cardExpMon);
		this.setCardExpYr(cardExpYr);
		this.setBillingAddress(billingAddress);
		this.setBillingCity(billingCity);
		this.setBillingPostalCode(billingPostalCode);
		this.setShippingAddress(shippingAddress);
		this.setShippingCity(shippingCity);
		this.setShippingPostalCode(shippingPostalCode);
		this.setDateEntered(dateEntered);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID
	 *            the customerID to set
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
	 * @param firstName
	 *            the firstName to set
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
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * @param address1
	 *            the address1 to set
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
	 * @param address2
	 *            the address2 to set
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
	 * @param city
	 *            the city to set
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
	 * @param state
	 *            the state to set
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
	 * @param postalCode
	 *            the postalCode to set
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
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
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
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the cardType
	 */
	public CardType getCardType() {
		return cardType;
	}

	/**
	 * @param cardType
	 *            the cardType to set
	 */
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber
	 *            the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the cardExpMon
	 */
	public String getCardExpMon() {
		return cardExpMon;
	}

	/**
	 * @param cardExpMon
	 *            the cardExpMon to set
	 */
	public void setCardExpMon(String cardExpMon) {
		this.cardExpMon = cardExpMon;
	}

	/**
	 * @return the cardExpYr
	 */
	public String getCardExpYr() {
		return cardExpYr;
	}

	/**
	 * @param cardExpYr
	 *            the cardExpYr to set
	 */
	public void setCardExpYr(String cardExpYr) {
		this.cardExpYr = cardExpYr;
	}

	/**
	 * @return the billingAddress
	 */
	public String getBillingAddress() {
		return billingAddress;
	}

	/**
	 * @param billingAddress
	 *            the billingAddress to set
	 */
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * @return the billingCity
	 */
	public String getBillingCity() {
		return billingCity;
	}

	/**
	 * @param billingCity
	 *            the billingCity to set
	 */
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	/**
	 * @return the billingPostalCode
	 */
	public String getBillingPostalCode() {
		return billingPostalCode;
	}

	/**
	 * @param billingPostalCode
	 *            the billingPostalCode to set
	 */
	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}

	/**
	 * @return the shippingAddress
	 */
	public String getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @param shippingAddress
	 *            the shippingAddress to set
	 */
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/**
	 * @return the shippingCity
	 */
	public String getShippingCity() {
		return shippingCity;
	}

	/**
	 * @param shippingCity
	 *            the shippingCity to set
	 */
	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	/**
	 * @return the shippingPostalCode
	 */
	public String getShippingPostalCode() {
		return shippingPostalCode;
	}

	/**
	 * @param shippingPostalCode
	 *            the shippingPostalCode to set
	 */
	public void setShippingPostalCode(String shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}

	/**
	 * @return the dateEntered
	 */
	public Date getDateEntered() {
		return dateEntered;
	}

	/**
	 * @param dateEntered
	 *            the dateEntered to set
	 */
	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
	}

	@Override
	public String toString() {
		return "Customer [customerId = " + this.customerID + ", firstName = "
				+ this.firstName + "" + ", lastName = " + this.lastName
				+ ", address1 = " + this.address1 + " address2 = "
				+ this.address2 + ", city = " + this.city + ", state = "
				+ this.state + ", postalCode = " + this.postalCode
				+ ", country = " + this.country + ", email = " + this.email
				+ ", password = " + this.password + ", cardType = "
				+ this.cardType + ", cardNumber = " + this.cardNumber
				+ ", cardExpMon = " + this.cardExpMon + ", cardExpYr = "
				+ this.cardExpYr + ", billingAddress = " + this.billingAddress
				+ ", billingCity = " + this.billingCity
				+ ", billingPostalCode = " + this.billingPostalCode
				+ ", shippingAddress = " + this.shippingAddress
				+ ", shippingCity = " + this.shippingCity
				+ ", shippingPostalCode = " + this.shippingPostalCode
				+ ", dateEntered = " + this.dateEntered;
	}
}
