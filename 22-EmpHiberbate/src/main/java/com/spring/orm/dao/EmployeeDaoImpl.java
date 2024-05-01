package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.EmployeeSpring;

public class EmployeeDaoImpl implements EmployeeDao {
	private HibernateTemplate hbrtmp;

	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDaoImpl(HibernateTemplate hbrtmp) {
		super();
		this.hbrtmp = hbrtmp;
	}

	public HibernateTemplate getHbrtmp() {
		return hbrtmp;
	}

	public void setHbrtmp(HibernateTemplate hbrtmp) {
		this.hbrtmp = hbrtmp;
	}

	@Override
	@Transactional
	public int saveemployee(EmployeeSpring emps) {
		int savedetails = (int) hbrtmp.save(emps);
		return savedetails;
	}

	@Override
	@Transactional
	public EmployeeSpring viewoneemployee(int eid) {
		EmployeeSpring emp = hbrtmp.get(EmployeeSpring.class, eid);
		return emp;

	}

	@Override
	@Transactional
	public void updateEmployee(EmployeeSpring emps) {
		hbrtmp.update(emps);

	}

	@Override
	public List<EmployeeSpring> employeeall() {
		List<EmployeeSpring> es = hbrtmp.loadAll(EmployeeSpring.class);
		return es;
	}

	@Override
	@Transactional
	public void deleteEmployee(int eid) {
		EmployeeSpring emps = hbrtmp.get(EmployeeSpring.class, eid);
		if (emps != null) {
			hbrtmp.delete(emps);
		}

	}

}
