package com.Emp.Student;

public class Studentpojo {
       private String  rollno;
       private String  name;
       private String  cource;
       private int batch;
       private String doj;
       // default constructor
       public Studentpojo() {
    	   
       }
   // parameterized constructor
	public Studentpojo(String rollno,String name,String cource,int batch,String doj) {
		this.rollno=rollno;
		this.name=name;
		this.cource=cource;
		this.batch=batch;
		this.doj=doj;
	}
	// Setter methods
	
	public void setRollno(String rollno) {
		this.rollno=rollno;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setCource(String cource) {
		this.cource=cource;
	}
	public void setBatch(int batch) {
		this.batch=batch;
	}
    public void setDoj(String doj) {
    	this.doj=doj;
    }
    
    // getter methods
    
    public String getRollno() {
    	return this.rollno;
    }
    public String getName() {
    	return this.name;
    }
    public String getCource() {
    	return this.cource;
    }
    public int getBatch() {
    	return this.batch;
    }
     public String getDoj() {
    	 return this.doj;
     }
	
}
