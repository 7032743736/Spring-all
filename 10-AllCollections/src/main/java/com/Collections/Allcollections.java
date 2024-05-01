package com.Collections;
import java.util.*;
public class Allcollections {
      
	private List<String> empnames;
	private Set<Integer> empnum;
	private Map<String,Integer> empDepno;
	private Properties empsalary;
	
	public Allcollections() {
		// TODO Auto-generated constructor stub
	}
   
	public Allcollections(List<String> empnames,Set<Integer> empnum, Map<String,Integer> empDepno,Properties empsalary) {
		this.empnames=empnames;
		this.empnum=empnum;
		this.empDepno=empDepno;
		this.empsalary=empsalary;
	}
	public void setEmpnames(List<String> empnames) {
		this.empnames=empnames;
	}
	public List<String> getEmpnames(){
		return this.empnames;
	}
	public void setEmpnum(Set<Integer> empnum) {
		this.empnum=empnum;
	}
	public Set<Integer> getEmpnum(){
		return this.empnum;
	}
	public void setEmpDepno(Map<String,Integer> empDepno) {
		this.empDepno=empDepno;
	}
	public Map<String,Integer> getEmpDepno(){
		return this.empDepno;
	}
	public void setEmpsalary(Properties empsalary) {
		this.empsalary=empsalary;
	}
	public Properties getEmpsalary() {
		return this.empsalary;
	}
	
	public void printdetails() {
		System.out.println("Employee names");
		for(String names:empnames) {
			System.out.println(names);
		}
		
		System.out.println("\nEmployee Numbers:");
        for (Integer num : empnum) {
            System.out.println(num);
        }
        
        
        System.out.println("\nEmployee Department Numbers:");
        for (Map.Entry<String, Integer> entry : empDepno.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\nEmployee Salaries");
          Set<String> Keys=empsalary.stringPropertyNames();
          for(String key:Keys) {
        	  System.out.println(key+":"+empsalary.getProperty(key));
          }
	}
}
