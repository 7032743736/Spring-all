package com.spring.orm;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.EmployeeDao;


import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		EmployeeDao emp =context.getBean("empDao", EmployeeDao.class);
//		EmployeeSpring emps =new EmployeeSpring();
//		emps.setEid(101);
//		emps.setEmpName("manu");
//		emps.setEmpDomain("developer");
//	    emp.saveemployee(emps);
		
//		EmployeeSpring e=emp.viewoneemployee(101);
//		System.out.println(e);
		
//		           EmployeeSpring emps=emp.viewoneemployee(101);
//		            emps.setEmpName("manohar");
//		            emps.setEmpDomain("springboot developer");
//		            emp.updateEmployee(emps);
//		            System.out.println("updatedSucessfully");
//		
		  
	List<EmployeeSpring> es= emp.employeeall();
	System.out.println(es);
		
//		emp.deleteEmployee(102);\

    
    }
}