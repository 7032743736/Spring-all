package com.Emp.Student;

public class Student {
         private String studentname;
         private int studentclass;
         private Marks marks;
         
	public Student(String studentname,int studentclass,Marks marks ) {
		  this.studentname=studentname;
		  this.studentclass=studentclass;
		  this.marks=marks;
	}
         void setMarks(Marks marks) {
        	 this.marks=marks;
         }
         Marks getMarks() {
        	 return this.marks;
         }
         void setStudentname(String studentname) {
        	 this.studentname=studentname;
         }
         String getStudentname() {
        	 return this.studentname;
         }
         
         void setStudentclass(int studentclass) {
        	 this.studentclass=studentclass;
         }
         int getStudentclass() {
        	 return this.studentclass;
         }
         
        
}
