package com.student;

public class StudentBean {
    private int sid;
    private String name;
    private String cource;
    private int batch;
    private String location;
	public StudentBean() {
		
	}
	public StudentBean(int sid,String name,String cource,int batch,String location) {
		this.sid=sid;
		this.name=name;
		this.cource=cource;
		this.batch=batch;
		this.location=location;
	}
	
	void setId(int sid) {
		this.sid=sid;
	}
    void setName(String name) {
    	this.name=name;
    }
    void setCource(String cource) {
    	this.cource=cource;
    }
    void setBatch(int batch) {
    	this.batch=batch;
    }
    void setLocation(String location) {
    	this.location=location;
    }
    
    int getId() {
    	return this.sid;
    }
    String getName() {
    	return this.name;
    }
    String getCource() {
    	return this.cource;
    }
    int getBatch() {
    	return this.batch;
    }
    String getLocation() {
    	return this.location;
    }
    void print() {
    	System.out.println("Student-details");
    	System.out.println("id: "+sid);
    	System.out.println("name: "+name);
    	System.out.println("cource: "+cource);
    	System.out.println("batch: "+batch);
    	System.out.println("location: "+location);
    }
}
