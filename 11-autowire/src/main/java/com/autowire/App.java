package com.autowire;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        // Load the Spring configuration file
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        // Retrieve the beans
        First firstBean = (First) context.getBean("b"); // Get the 'b' bean
        Second s=new Second(1,"manu","noa");
        s.printc();
        // Call the print method to print the details
        firstBean.print();
    }
}
