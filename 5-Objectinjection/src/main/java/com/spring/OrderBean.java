package com.spring;

public class OrderBean {
            private int orderid;
            private ProductBean product;
	public OrderBean() {
		// TODO Auto-generated constructor stub
	}
    public OrderBean(int orderid,ProductBean product) {
    	this.orderid=orderid;
    	this.product=product;
    }
    void setOrderid(int orderid) {
    	this.orderid=orderid;
    }
    void setProduct(ProductBean product) {
    	this.product=product;
    }
    int getOrderid() {
    	return this.orderid;
    }
    ProductBean getProduct() {
    	return this.product;
    }
    void print() {
    	System.out.println(" product details:");
    	System.out.println(" order id: "+ orderid);
    	System.out.println("product id: "+ product.getProductId());
    	System.out.println("product name:"+product.getProductName());

    }
}
