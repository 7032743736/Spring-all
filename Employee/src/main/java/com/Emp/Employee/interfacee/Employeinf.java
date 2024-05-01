package com.Emp.Employee.interfacee;

public class Employeinf implements EmployeeInteface {
    private String name;
    private int age;
    private double salary;
	public Employeinf() {
		
	}
	public Employeinf(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	@Override
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public void setAge(int age) {
	this.age = age;
	}
	@Override
	public void setSalary(double salary) {
	this.salary = salary;
	}
	@Override
	public String getName() {
	return this.name;
	}
	@Override
	public int getAge() {
	return this.age;
	}
	@Override
	public double getSalary() {
		return this.salary;
	}
}
