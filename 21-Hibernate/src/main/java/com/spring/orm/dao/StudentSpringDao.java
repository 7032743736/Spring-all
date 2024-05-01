package com.spring.orm.dao;

import java.util.List;


import com.spring.orm.StudentSpring;



public interface StudentSpringDao {
          
	public int savestudent(StudentSpring stbean);
	public StudentSpring viewstudentone(int id);
	public void updatestudent(StudentSpring stbean);
	public void deletestudent(int id);
	public List <StudentSpring> studentall();
	
}
