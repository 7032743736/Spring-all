package com.annotation;

public class Model {
            private int id;
            private String name;
            private String carmodel;
	public Model() {
		// TODO Auto-generated constructor stub
	}
	public Model(int id, String name, String carmodel) {
		this.id=id;
		this.name=name;
		this.carmodel=carmodel;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel=carmodel;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getCarmodel() {
		return this.carmodel;
	}
	public void start() {
		System.out.println("the car was started");
		System.out.println(id+" "+ name+" "+ " "+carmodel);
	}

}
