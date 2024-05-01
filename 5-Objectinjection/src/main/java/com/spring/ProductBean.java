package com.spring;

public class ProductBean {
              private int productId;
              private String productName;
              private double productPrice;
              private int productQuality;
	public ProductBean() {
		// TODO Auto-generated constructor stub
	}
	public ProductBean(int productId,String productName, double productPrice,int productQuality) {
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
		this.productQuality=productQuality;
	}
	
	void setProductId(int productId) {
		this.productId=productId;
	}
	void setProductName(String productName) {
		this.productName=productName;
	}
	void setProductPrice(double productPrice) {
		this.productPrice=productPrice;
	}
	void setProductQuality(int productQuality)
	{
		this.productQuality=productQuality;
	}
	
	int getProductId() {
		return this.productId;
	}
	String getProductName() {
		return this.productName;
	}
	double getProductPrice() {
		return this.productPrice;
	}
	int getProductQuality() {
		return this.productQuality;
	}

}
