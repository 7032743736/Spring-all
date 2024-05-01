package com.Emp.Employee;

public class EmployeeSetter {
	  
    private int Empid;
    private String EmpName;
    private int EmpAge;
    
    public void setEmpid(int id) {
        this.Empid = id;
    }
    
    public int getEmpid() {
        return Empid;
    }
    
    public void setEmpName(String name) {
        this.EmpName = name;
    }
    
    public String getEmpName() {
        return EmpName;
    }
    
    public void setEmpAge(int age) {
        this.EmpAge = age;
    }
    
    public int getEmpAge() {
        return EmpAge;
    }
    
    public void print() {
    	System.out.println("Employee ID: " + getEmpid());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Employee Age: " + getEmpAge());
    }
}

