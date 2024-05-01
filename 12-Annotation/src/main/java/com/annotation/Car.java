package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
              private Model model;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(Model model) {
		this.model=model;
		System.out.println("This one is a constructor");
	}
	@Autowired
    public void setModel(Model model) {
    	this.model=model;
    	System.out.println("this one is a setter");
    }
    public Model getModal() {
    	return this.model;
    }
    public void carStarted() {
    	if(model!= null) {
    		model.start();
    	}
    	else {
    		System.out.println("not started");
    	}
    }
}
