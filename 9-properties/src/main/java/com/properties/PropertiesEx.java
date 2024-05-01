package com.properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesEx {
       private Properties StudentBatches;
	public PropertiesEx() {
		// TODO Auto-generated constructor stub
	}
        public PropertiesEx(Properties StudentBatches) {
        	this.StudentBatches=StudentBatches;
        }
        public void setStudentBatches(Properties StudentBatches) {
        	this.StudentBatches=StudentBatches;
        }
        public Properties getStudentBatches() {
        	return this.StudentBatches;
        }
        
        
        public void printStudentBatches() {
        	Set<String>Keys=StudentBatches.stringPropertyNames();
        	for (String key:Keys) {
        		System.out.println(key+":"+StudentBatches.getProperty(key));
        	}
        }
}
