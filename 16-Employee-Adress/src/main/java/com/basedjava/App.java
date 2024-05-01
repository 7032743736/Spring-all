package com.basedjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       @SuppressWarnings("resource")
	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigJava.class);
        Employee em=(Employee) context.getBean("nu");
        em.display();
    }
}
