package com.basedjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigJava {

	
	@Bean
	public Employee getBean1() {
		
		  Address address =new Address();
		  address.setCity("kavali(m)");
		  address.setColony("kattamareddy veri street");
		  address.setState("andhra pradesh");
		  address.setPin(524201);
		  Employee emp=new Employee();
			emp.setId(12);
			emp.setName("manu");
			emp.setAddress(address);
		
		return emp;
	}
	
	@Bean("nu")
	public Employee getBean2() {
		
		  Address address =new Address();
		  address.setCity("hyderabad");
		  address.setColony("yalla reddy guda");
		  address.setState("telanga");
		  address.setPin(5000701);
		  Employee emp=new Employee();
			emp.setId(123);
			emp.setName("manohar");
			emp.setAddress(address);
		  
		
		return emp;
	}
	

}
