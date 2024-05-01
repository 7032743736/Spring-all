package com.spring.orm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentSpring {
	           @Id
               private int sid;
               private String sName;
               private String sCource;
	public StudentSpring() {
		// TODO Auto-generated constructor stub
	}
	public StudentSpring(int sid, String sName, String sCource) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sCource = sCource;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCource() {
		return sCource;
	}
	public void setsCource(String sCource) {
		this.sCource = sCource;
	}
	@Override
	public String toString() {
		return "StudentSpring [sid=" + sid + ", sName=" + sName + ", sCource=" + sCource + "]";
	}
	

}
