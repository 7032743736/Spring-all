package com.basedjava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeExample {
	  @Value("101")
    private int id;
	  @Value("manu")
    private String name;
	  @Value("1")
    private int experience;
	  @Value("medical")
    private String department;

    public EmployeeExample(int id, String name, int experience, String department) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.department = department;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for experience
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    

	public void printDetails() {
		System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Department: " + department);
	}
}
