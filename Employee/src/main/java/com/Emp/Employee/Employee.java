package com.Emp.Employee;

public class Employee {
	          int EmpId;
	          String EmpName;
            public static void main(String[] args) {
            	Employee e=new Employee();
            	e.EmpId=101;
            	e.EmpName="manu";
            	System.out.println("EmployeeID  : "+e.EmpId);
            	System.out.println("EmployeeName: "+e.EmpName);
            }
}
