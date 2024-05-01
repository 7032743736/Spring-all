package com.jdbc;

import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        StudentJdbc st = (StudentJdbc) context.getBean("jdbcId3"); 
        try {
//            st.create();
//          st.insert();
     //   	st.delete();
//        	st.updateRecord();
        	st.getOneRecord();
        	
        } catch (Exception e) {
        	
            System.err.println("Error creating table: " + e.getMessage());
        }
    }
}
