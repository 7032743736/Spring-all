package com.autowire;

public class Second {
                    private int id;
                    private String name;
                    private String cource;
	public Second() {
		// TODO Auto-generated constructor stub
	}
    public Second(int id,String name,String cource) {
    	this.id=id;
    	this.name=name;
    	this.setCource(cource);
    	System.out.println("this a constructor method");
    }
    public void setId(int id) {
    	System.out.println("this setter method");
    	this.id=id;
    }
    public int getId() {
    	System.out.println("This a getter method");
    	return this.id;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public String getName() {
    	return this.name;
    }
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public void printc() {
		System.out.println("nxknxjk");
	}
}
