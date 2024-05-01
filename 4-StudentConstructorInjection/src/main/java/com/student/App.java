package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("configuration.xml");
        StudentBean stdbean=(StudentBean) context.getBean("stu");
        stdbean.print();
    }
}
