package com.basedjava;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
        Product pb=(Product) context.getBean("getProduct");
        pb.printProduct();
    }
}
