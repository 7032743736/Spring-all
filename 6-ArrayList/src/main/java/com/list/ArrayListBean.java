package com.list;

import java.util.List;

public class ArrayListBean {
    private List<String> studentNames; // variable name changed to follow Java naming conventions

    // Constructor with parameter to initialize the list
    public ArrayListBean(List<String> studentNames) {
        this.studentNames = studentNames;
    }

    // Default constructor
    public ArrayListBean() {
        // No initialization needed
    }

    // Setter for studentNames
    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }

    // Getter for studentNames
    public List<String> getStudentNames() {
        return this.studentNames;
    }

    // Method to print all student names
    public void print() {
        for (String student : studentNames) {
            System.out.println(student);
        }
    }
}
