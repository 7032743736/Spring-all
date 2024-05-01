package com.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeBean {
                private int empid;
                private String empName;
                private double empSalary;
                private int deptNo;
                private JdbcTemplate it;
                
                            
	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}
         public EmployeeBean(int empid, String empName,double empSalary,int deptNo,JdbcTemplate it) {
        	 this.empid=empid;
        	 this.empName=empName;
        	 this.empSalary=empSalary;
        	 this.deptNo=deptNo;
        	 this.it=it;
        	 
         }
         
         public void setEmpid(int empid) {
        	 this.empid=empid;
         }
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}
		public int getDeptNo() {
			return deptNo;
		}
		public void setDeptNo(int deptNo) {
			this.deptNo = deptNo;
		}
		public JdbcTemplate getIt() {
			return it;
		}
		public void setIt(JdbcTemplate it) {
			this.it = it;
		}
		public int getEmpid() {
			return empid;
		}
		
		
		public void create() {
			it.execute("create table employee (empid number, empName varchar2(20), empSalary number, depNo number )");
			System.out.println("Table created");
			
		}
		public void insert() {
			it.update("insert into employee(empid,empName,empSalary,depNo) values (104,'nandhini',45000,14)");
			System.out.println("inserted values");
		}
		public void delete() {
			it.update("delete from employee where empid=101");
			System.out.println("deleted");
			
		}
		public void updateRecord() {
			it.update("update employee set empid=102 where empName ='kavya'");
			System.out.println("updated");
		}
}
