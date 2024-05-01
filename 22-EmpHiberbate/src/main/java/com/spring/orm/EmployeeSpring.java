package com.spring.orm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeSpring {
	           @Id
                private   int eid;
                  private String empName;
                  private String empDomain;
	public EmployeeSpring() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeSpring(int eid, String empName, String empDomain) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empDomain = empDomain;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDomain() {
		return empDomain;
	}
	public void setEmpDomain(String empDomain) {
		this.empDomain = empDomain;
	}
	@Override
	public String toString() {
		return "EmployeeSpring [eid=" + eid + ", empName=" + empName + ", empDomain=" + empDomain + "]";
	}
    
}
