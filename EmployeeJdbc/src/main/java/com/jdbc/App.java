package com.jdbc;

import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        EmployeeBean emp = (EmployeeBean) context.getBean("empbean"); 
        try {
//            emp.create();
//        	emp.insert();
//        	emp.delete();
        	emp.updateRecord();
        } catch (Exception e) {
        	
            System.err.println("Error creating table: " + e.getMessage());
        }
    }
}
