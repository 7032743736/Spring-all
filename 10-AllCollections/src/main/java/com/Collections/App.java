package com.Collections;


import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	Allcollections col=(Allcollections)context.getBean("tech");
    	col.printdetails();
    }
}
