package com.ecommerce.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents the collection card_details in mongodb 
 * @author Nitin Vashisth
 *
 */
@Document(collection="card_details")
public class Card_Details {
     
	@Id
	private String cardID;
	
	public static enum CardTypes {
		credit_card,
		debit_card
	}
	
	private CardTypes card_type;
	private String card_number;
	private String owner;
	private byte expiry_mon;
	private byte expiry_year;
	private byte cvc;
	
	@PersistenceConstructor
	public Card_Details(CardTypes card_type,
			            String card_number,
			            String owner,
			            byte expiry_mon,
			            byte expiry_year,
			            byte cvc) {
		
		this.setCard_type(card_type);
		this.setCard_number(card_number);
		this.setOwner(owner);
		this.setExpiry_mon(expiry_mon);
		this.setExpiry_year(expiry_year);
		this.setCvc(cvc);
	}
	
	
	/**
	 * @return the cardID
	 */
	public String getCardID() {
		return cardID;
	}


	/**
	 * @param cardID the cardID to set
	 */
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}


	/**
	 * @return the card_type
	 */
	public CardTypes getCard_type() {
		return card_type;
	}


	/**
	 * @param card_type the card_type to set
	 */
	public void setCard_type(CardTypes card_type) {
		this.card_type = card_type;
	}


	/**
	 * @return the card_number
	 */
	public String getCard_number() {
		return card_number;
	}


	/**
	 * @param card_number the card_number to set
	 */
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}


	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}


	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}


	/**
	 * @return the expiry_mon
	 */
	public byte getExpiry_mon() {
		return expiry_mon;
	}


	/**
	 * @param expiry_mon the expiry_mon to set
	 */
	public void setExpiry_mon(byte expiry_mon) {
		this.expiry_mon = expiry_mon;
	}


	/**
	 * @return the expiry_year
	 */
	public byte getExpiry_year() {
		return expiry_year;
	}


	/**
	 * @param expiry_year the expiry_year to set
	 */
	public void setExpiry_year(byte expiry_year) {
		this.expiry_year = expiry_year;
	}


	/**
	 * @return the cvc
	 */
	public byte getCvc() {
		return cvc;
	}


	/**
	 * @param cvc the cvc to set
	 */
	public void setCvc(byte cvc) {
		this.cvc = cvc;
	}

	@Override
	public String toString() {
		return "Card_Details [card_type = "+ card_type + " ,card_number = "+ card_number +
				" ,owner = "+ owner + ", expiry_mon = "+ expiry_mon +" ,expiry_year = "+
				expiry_year + " ,cvc = "+ cvc + "]";
	}
    
}
