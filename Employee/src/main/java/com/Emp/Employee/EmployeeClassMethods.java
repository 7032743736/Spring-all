package com.Emp.Employee;

public class EmployeeClassMethods {
           int Empid;
           String EmpName;
           public void insert(int id,String name){
        	   Empid=id;
        	   EmpName=name;
           }
	   public void print() {
		   System.out.println(Empid);
		   System.out.println(EmpName);
	   }
	   
}
