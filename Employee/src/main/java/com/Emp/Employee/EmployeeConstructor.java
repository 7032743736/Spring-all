package com.Emp.Employee;

public class EmployeeConstructor {
             int Empid;
             String EmpName;
             String Batch;
	public EmployeeConstructor(int Id,String Name, String Domain) {  // perametrised constructor
		this.Empid=Id;
		this.EmpName=Name;
		this.Batch=Domain;
	}
	public void print() {
		System.out.println("Employee id   : "+Empid);
		System.out.println("Employee Name : "+EmpName);
		System.out.println("Employee Batch: "+Batch);
		
	}

}
