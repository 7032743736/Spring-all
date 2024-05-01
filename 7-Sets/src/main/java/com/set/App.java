package com.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
    	AmeerpetTechnologies at=(AmeerpetTechnologies ) context.getBean("tech");
    	at.print();
    }
}
