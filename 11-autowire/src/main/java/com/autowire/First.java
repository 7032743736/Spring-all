package com.autowire;

public class First {
           private Second second;
	public First() {
		// TODO Auto-generated constructor stub
	}
	public First(Second second) {
		this.second=second;
	}
     public void setSecond(Second second) {
    	 this.second=second;
     }
     public Second getSecond() {
    	 return this.second;
     }
     
     public void print() {
    	  System.out.println("Second Bean Information:");
          System.out.println("ID: " + second.getId());
          System.out.println("Name: " + second.getName());
     }
}
