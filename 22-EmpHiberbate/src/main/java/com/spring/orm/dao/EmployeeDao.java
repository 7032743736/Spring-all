package com.spring.orm.dao;

import com.spring.orm.EmployeeSpring;

import java.util.List;

public interface EmployeeDao {
   public int saveemployee(EmployeeSpring emps);
   public EmployeeSpring viewoneemployee(int eid);
   public void updateEmployee(EmployeeSpring emps);
   public void deleteEmployee(int eid);
   public List <EmployeeSpring> employeeall();
}
