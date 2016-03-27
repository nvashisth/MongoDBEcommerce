package com.ecommerce.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Class representing the category collection in mongoDb.
 * 
 * @author Nitin Vashisth
 * 
 */
@Document(collection = "category")
public class Category {
	
	@Id
	private String categoryID;
	
	private String categoryName;
	private String description;
	//Represents Base64 representation of image.
	private String image;
	private boolean active;
	
	public Category() {}
	
	@PersistenceConstructor
	public Category(String categoryName, String description, String image, boolean active) {
		this.setCategoryName(categoryName);
		this.setDescription(description);
		this.setImage(image);
		this.setActive(active);
	}

	/**
	 * @return the categoryID
	 */
	public String getCategoryID() {
		return categoryID;
	}

	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Category [categoryID = " + this.categoryID + ", description = " + this.description
				 + ", image = " + this.image + ", active = " + this.active + "]";
	}
}
