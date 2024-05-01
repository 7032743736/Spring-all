package com.mvn.mvnFirst;

public class Product {
    private int productid;
    private String pname;
    private double price;
    private int quantity;
// default constructor 
      public Product(){
    	  
      }
//    // Constructor
//    public Product(int pid, String name, double price, int Qnty) {
//        this.productid = pid;
//        this.pname = name;
//        this.price = price;
//        this.quantity = Qnty;
//    }

    // Getter for productid
    public int getProductid() {
        return productid;
    }

    // Setter for productid
    public void setProductid(int productid) {
        this.productid = productid;
    }

    // Getter for pname
    public String getPname() {
        return pname;
    }

    // Setter for pname
    public void setPname(String pname) {
        this.pname = pname;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
