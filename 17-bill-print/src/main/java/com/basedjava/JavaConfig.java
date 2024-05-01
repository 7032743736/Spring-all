package com.basedjava;
import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
                   Scanner sc=new Scanner(System.in);
                   @Bean
                   public Product getProduct() {
                	   System.out.println("Enter product id:");
                	   int id=sc.nextInt();
                	   System.out.println("Enter Product name:"); 
                	    
                	   String name=sc.next();
                	   sc.nextLine();
                	   System.out.println("Enter the quantity:");
                	   int qnty=sc.nextInt();
                	   System.out.println("Enter the price:");
                	    double price= sc.nextDouble();
                	   
                	   Product pb=new Product(id,name,qnty,price);
					return pb;
                	   
                   }

}
