package com.basedjava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1")
    private int SId;
	@Value("manu")
    private String SName;
	@Value("java full stack")
    private String Course;
	@Value("11 th batch")
    private String SBatch;

    public Student() {
        // Default constructor
    }

    public Student(int SId, String SName, String Course, String SBatch) {
        this.SId = SId;
        this.SName = SName;
        this.Course = Course;
        this.SBatch = SBatch;
    }

    // Getter and Setter for SId
    public int getSId() {
        return SId;
    }

    public void setSId(int SId) {
        this.SId = SId;
    }

    // Getter and Setter for SName
    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    // Getter and Setter for Course
    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    // Getter and Setter for SBatch
    public String getSBatch() {
        return SBatch;
    }

    public void setSBatch(String SBatch) {
        this.SBatch = SBatch;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student ID: " + SId);
        System.out.println("Student Name: " + SName);
        System.out.println("Course: " + Course);
        System.out.println("Batch: " + SBatch);
    }
}
