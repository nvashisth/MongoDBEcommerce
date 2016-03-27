package com.ecommerce.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
* Class representing the products collection in mongoDb.
* 
* @author Nitin Vashisth
* 
*/
@Document(collection = "products")
public class Products {
	
	@Id
	private String productID;
	
	private String vendorProductID;
	private String productName;
	private String productDescription;
	//used to get the supplierID from supplier collection using supplierName
	private String supplierName;
	private String  supplierID;
	//used to get the categoryID from category collection using categoryName
	private String categoryName;
	private String  categoryID;
	private String  qtyPerUnit;
	private float  unitPrice;
	private String msrp;
	private String[] availableColors;
	private String[] availableSize;
	private String  size;
	private String color;
	private float  discount;
	private float unitWeight;
	private int unitsInStock;
	private int unitsInOrder;
	private boolean productAvailable;
	private boolean discountAvailable;
	private int currentOrder;
	//String representation of Base64 image
	private String picture;
	private int ranking;
	private String note;
	
	@PersistenceConstructor
	public Products(String vendorProductID, String productName, String productDescription,
			String supplierName, String categoryName, String  qtyPerUnit, float  unitPrice,
			String msrp, String[] availableColors, String[] availableSize, String  size,
			String color, float  discount, float unitWeight, int unitsInStock, int unitsInOrder,
			boolean productAvailable, boolean discountAvailable, int currentOrder, String picture,
			int ranking, String note) {
		this.setVendorProductID(vendorProductID);
		this.setProductName(productName);
		this.setProductDescription(productDescription);
		this.setSupplierName(supplierName);
		this.setSupplierID("");
		this.setCategoryName(categoryName);
		this.setCategoryID("");
		this.setQtyPerUnit(qtyPerUnit);
		this.setUnitPrice(unitPrice);
		this.setMsrp(msrp);
		this.setAvailableColors(availableColors);
		this.setAvailableSize(availableSize);
		this.setSize(size);
		this.setColor(color);
		this.setDiscount(discount);
		this.setUnitWeight(unitWeight);
		this.setUnitsInStock(unitsInStock);
		this.setUnitsInOrder(unitsInOrder);
		this.setProductAvailable(productAvailable);
		this.setDiscountAvailable(discountAvailable);
		this.setCurrentOrder(currentOrder);
		this.setPicture(picture);
		this.setRanking(ranking);
		this.setNote(note);
	}

	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}

	/**
	 * @return the vendorProductID
	 */
	public String getVendorProductID() {
		return vendorProductID;
	}

	/**
	 * @param vendorProductID the vendorProductID to set
	 */
	public void setVendorProductID(String vendorProductID) {
		this.vendorProductID = vendorProductID;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * @return the supplierID
	 */
	public String getSupplierID() {
		return supplierID;
	}

	/**
	 * @param supplierID the supplierID to set
	 */
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
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
	 * @return the qtyPerUnit
	 */
	public String getQtyPerUnit() {
		return qtyPerUnit;
	}

	/**
	 * @param qtyPerUnit the qtyPerUnit to set
	 */
	public void setQtyPerUnit(String qtyPerUnit) {
		this.qtyPerUnit = qtyPerUnit;
	}

	/**
	 * @return the unitPrice
	 */
	public float getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the msrp
	 */
	public String getMsrp() {
		return msrp;
	}

	/**
	 * @param msrp the msrp to set
	 */
	public void setMsrp(String msrp) {
		this.msrp = msrp;
	}

	/**
	 * @return the availableColors
	 */
	public String[] getAvailableColors() {
		return availableColors;
	}

	/**
	 * @param availableColors the availableColors to set
	 */
	public void setAvailableColors(String[] availableColors) {
		this.availableColors = availableColors;
	}

	/**
	 * @return the availableSize
	 */
	public String[] getAvailableSize() {
		return availableSize;
	}

	/**
	 * @param availableSize the availableSize to set
	 */
	public void setAvailableSize(String[] availableSize) {
		this.availableSize = availableSize;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the discount
	 */
	public float getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(float discount) {
		this.discount = discount;
	}

	/**
	 * @return the unitWeight
	 */
	public float getUnitWeight() {
		return unitWeight;
	}

	/**
	 * @param unitWeight the unitWeight to set
	 */
	public void setUnitWeight(float unitWeight) {
		this.unitWeight = unitWeight;
	}

	/**
	 * @return the unitsInStock
	 */
	public int getUnitsInStock() {
		return unitsInStock;
	}

	/**
	 * @param unitsInStock the unitsInStock to set
	 */
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	/**
	 * @return the unitsInOrder
	 */
	public int getUnitsInOrder() {
		return unitsInOrder;
	}

	/**
	 * @param unitsInOrder the unitsInOrder to set
	 */
	public void setUnitsInOrder(int unitsInOrder) {
		this.unitsInOrder = unitsInOrder;
	}

	/**
	 * @return the productAvailable
	 */
	public boolean isProductAvailable() {
		return productAvailable;
	}

	/**
	 * @param productAvailable the productAvailable to set
	 */
	public void setProductAvailable(boolean productAvailable) {
		this.productAvailable = productAvailable;
	}

	/**
	 * @return the discountAvailable
	 */
	public boolean isDiscountAvailable() {
		return discountAvailable;
	}

	/**
	 * @param discountAvailable the discountAvailable to set
	 */
	public void setDiscountAvailable(boolean discountAvailable) {
		this.discountAvailable = discountAvailable;
	}

	/**
	 * @return the currentOrder
	 */
	public int getCurrentOrder() {
		return currentOrder;
	}

	/**
	 * @param currentOrder the currentOrder to set
	 */
	public void setCurrentOrder(int currentOrder) {
		this.currentOrder = currentOrder;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * @return the ranking
	 */
	public int getRanking() {
		return ranking;
	}

	/**
	 * @param ranking the ranking to set
	 */
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

}
