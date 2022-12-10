package com.mymart.model;
import java.util.Objects;
public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(productId, productName, productPrice);
	}
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (this==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Product other =(Product)obj;
		return false;
		
	}
}