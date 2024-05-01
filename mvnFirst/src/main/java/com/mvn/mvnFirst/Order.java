package com.mvn.mvnFirst;
 

public class Order {
            private int orderid;
            private String name;
            private Product product;
//	public Order( int oid,String name,Product prod) {
//	       this.orderid=oid;
//	       this.name=name;
//	       this.product=prod;
//	} 
            //default constructor
            public Order() {
            	
            }
            void setOrderid(int orderid) {
            	this.orderid=orderid;
            }
            int getOrderid() {
            	return this.orderid;
            }
           void setName(String name) {
            	this.name=name;
            }
           String getName() {
        	   return this.name;
           }
	  void setProduct(Product prod) {
		  this.product=prod;
	  }
	  Product getProduct() {
		  return this.product;
	  }
           void print() {
        	  System.out.println(orderid);
        	  System.out.println(name);
        	  System.out.println("product details");
        	  System.out.println(product.getProductid());
        	  System.out.println(product.getPname());
        	  System.out.println(product.getPrice());
        	  System.out.println(product.getQuantity());
        	  
           }
}
