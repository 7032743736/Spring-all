package com.basedjava;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration@ComponentScan("com.basedjava")
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
       
		ApplicationContext context= new AnnotationConfigApplicationContext(App.class);
        EmployeeExample emp=(EmployeeExample) context.getBean(EmployeeExample.class);
            emp.printDetails();
    }
}
