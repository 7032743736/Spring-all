package com.basedjava;

public class BeanClass {
	 private int id;
     private String name;
     
     // default constructor
	public BeanClass() {
		// TODO Auto-generated constructor stub
	}
	// parameterized constructor
	  public BeanClass(int id, String name) {
		  this.id=id;
		  this.name=name;
	  }
            public void setId(int id) {
            	this.id=id;
            }
            public int getId() {
            	return this.id;
            }
            public void setName(String name) {
            	this.name=name;
            }
            public String getName() {
            	return this.name;
            }
           
			public void display() {
				System.out.println("THE ID IS:   "+id);
            	System.out.println("THE NAME IS: "+name);
				
			}
}
