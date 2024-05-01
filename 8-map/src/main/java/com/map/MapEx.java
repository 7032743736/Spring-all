package com.map;

import java.util.Map;

public class MapEx {
      private Map<String,String> StudentCources;
	public MapEx() {
		// TODO Auto-generated constructor stub
	}
	public MapEx(Map<String,String> StudentCources) {
		this.StudentCources=StudentCources;
	}
    public void setStudentCources( Map<String,String> StudentCources) {
    	this.StudentCources=StudentCources;
    }
    public Map<String,String> getStudentCources(){
    	return this.StudentCources;
    }
    
    public void printcources() {
    	for (Map.Entry<String,String> entry:StudentCources.entrySet()) {
    		System.out.println(entry.getKey()+" "+entry.getValue());
    	}
    }
}
