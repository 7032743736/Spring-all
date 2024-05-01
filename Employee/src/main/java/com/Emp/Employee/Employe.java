package com.Emp.Employee;

public class Employe {
            private String name;
            private int age;
            private double salary;
	  //default constructor
       public Employe() {
		
	}
       // parameterized constructor
       public Employe(String name,int age, double salary ) {
    	   this.name=name;
    	   this.age=age;
    	   this.salary=salary;
       }
       //setter methods
        public void setName(String name) {
        	this.name=name;
        }
        public void setAge(int age) {
        	this.age=age;
        }
        public void setSalary(double salary) {
        	this.salary=salary;
        }
        //getter methods
        
        public String getName() {
        	return this.name;
        }
        public int getAge() {
        	return this.age;
        }
        public double getSalary() {
        	 return this.salary;
        }
        public void print() {
        	System.out.println(getName()+" "+getAge()+" "+getSalary());
        }
}
