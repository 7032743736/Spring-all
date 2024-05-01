package com.Emp.Student;

public class School {
	private String school;
	private Student student;

	public School(String school, Student student) {
		this.school = school;
		this.student = student;
	}

	void setSchool(String school) {
		this.school = school;
	}

	String getSchool() {
		return this.school;
	}

	void setStudent(Student student) {
		this.student = student;
	}

	Student getStudent() {
		return this.student;
	}

	void print() {
      		 System.out.println("school deatils: "+school);
      		 System.out.println("Student name: "+student.getStudentname());
      		 System.out.println("Student Class: "+student.getStudentclass());
      		System.out.println("Student telugumarks:"+student.getMarks().getTelugumarks());
      	 }
}
