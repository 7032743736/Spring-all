package com.Emp.Student.Studentinterface;

public class Studentinfo implements StudentInterface {
    
    String rollno;
    String name;
    int batch;
    String cource;
    String doj;
    
      
    public Studentinfo() {
        
    }
    
    public Studentinfo(String rollno, String name, int batch, String cource, String doj) {
         
        this.rollno = rollno;
        this.name = name;
        this.batch = batch;
        this.cource = cource;
        this.doj = doj;
    }

    @Override
    public void setRollno(String rollno) {
        
        this.rollno = rollno;
    }

    @Override
    public void setName(String name) {
        
        this.name = name;
    }

    @Override
    public void setBatch(int batch) {
        
        this.batch = batch;
    }

    @Override
    public void setCource(String cource) {
        
        this.cource = cource;
    }

    @Override
    public void setDoj(String doj) {
        
        this.doj = doj;
    }

    @Override
    public String getRollno() {
         return this.rollno;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBatch() {
        return this.batch;
    }

    @Override
    public String getCource() {
        return this.cource;
    }

    @Override
    public String getDoj() {
        return this.doj;
    }

	
}
