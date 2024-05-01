package com.list;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Specify the path to your XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        // Retrieve the bean named "institute" from the Spring application context
        ArrayListBean list = (ArrayListBean) context.getBean("institute");

        // Call the print method to print the list of student names
        list.print();
    }
}
