package com.basedjava;

public class Product {
    private int pId;
    private String pName;
    private int Qnty;
    private double price;

    public Product() {
        // Default constructor
    }

    public Product(int pId, String pName, int Qnty, double price) {
        this.pId = pId;
        this.pName = pName;
        this.Qnty = Qnty;
        this.price = price;
    }

    // Setter methods
    public void setPId(int pId) {
        this.pId = pId;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public void setQnty(int Qnty) {
        this.Qnty = Qnty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter methods
    public int getPId() {
        return this.pId;
    }

    public String getPName() {
        return this.pName;
    }

    public int getQnty() {
        return this.Qnty;
    }

    public double getPrice() {
        return this.price;
    }

    public void printProduct() {
        double total = price * Qnty;
        double discount = 0.0;

        if (total <= 3000) {
            discount = total * 0.1;
        } else if (total > 3000 && total <= 10000) {
            discount = total * 0.15;
        } else if (total > 10000) {
            discount = total * 0.2;
        }
        
        double actualAmount = total - discount;

        System.out.println("Total: " + total);
        System.out.println("Discount amount: " + discount);
        System.out.println("The amount should be paid: " + actualAmount);
    }
}
