package com.spr;

public class EmployeeSpring {
    private int id;
    private String name;
    private double salary;
    private int deptno;
    private String doj;
	
	public EmployeeSpring() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeSpring(int id, String name, double salary, int deptno, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptno = deptno;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public void print() {
		System.out.println("Employee-details");
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
		System.out.println(deptno);
		System.out.println(doj);
		
	}
	
}