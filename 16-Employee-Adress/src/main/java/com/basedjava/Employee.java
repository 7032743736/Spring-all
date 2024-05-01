package com.basedjava;

public class Employee {
                  private int id;
                  private String name;
                  private Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void setId(int id) {
		this.id=id;
	}
     public void setName(String name) {
    	 this.name=name;
     }
     public void setAddress(Address address) {
    	 this.address=address;
     }
     public int getId() {
    	 return this.id;
     }
     public String getName() {
    	 return this.name;
     }
     public Address getAddress() {
    	 return this.address;
     }
     public void display() {
    	 System.out.println("THE ID IS:      "+id );
    	 System.out.println("THE NAME IS:    "+name);
    	 System.out.println("THE CITY IS:    "+address.getCity());
    	 System.out.println("THE COLONY IS:  "+address.getColony());
    	 System.out.println("THE STATE IS:   "+address.getState());
    	 System.out.println("THE PIN IS:     "+address.getPin());



     }
}
