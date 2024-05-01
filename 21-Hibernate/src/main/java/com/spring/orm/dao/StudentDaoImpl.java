package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.StudentSpring;

public class StudentDaoImpl implements StudentSpringDao {
	
	
		private HibernateTemplate hibernateTemplate;
	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
                   
	@Override
	@Transactional
	public int savestudent(StudentSpring stbean) {
		int savedetails= (int) hibernateTemplate.save(stbean);
		return savedetails;
	}

	@Override
	@Transactional
	public StudentSpring viewstudentone(int sid) {
		StudentSpring stbean= hibernateTemplate.get(StudentSpring.class,sid);
		return stbean;
	}

	@Override
	@Transactional
	public void updatestudent(StudentSpring stbean) {
		 hibernateTemplate.update(stbean);
	}

	@Override
	@Transactional
	public void deletestudent(int sid) {
		StudentSpring student = hibernateTemplate.get(StudentSpring.class, sid);
        if (student != null) {
            hibernateTemplate.delete(student);
        }
		
	}

	@Override
	public List<StudentSpring> studentall() {
		List <StudentSpring> st= hibernateTemplate.loadAll(StudentSpring.class);
		return st;
		
	}
  
	
	
	
	
	

}
