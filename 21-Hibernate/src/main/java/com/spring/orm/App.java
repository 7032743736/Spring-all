package com.spring.orm;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentSpringDao;

//import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		StudentSpringDao stu =context.getBean("stDao", StudentSpringDao.class);
		// save data
		//StudentSpring stbean = new StudentSpring();
//		stbean.setSid(101);
//		stbean.setsName("manu");
//		stbean.setsCource("java");
//		stu.savestudent(stbean);
		
//		StudentSpring i=stu.viewstudentone(101);
//		System.out.println(i);
		
//		stu.deletestudent(101);
		
//		List<StudentSpring> st=stu.studentall();
//		System.out.println(st);
		
//		StudentSpring st=stu.viewstudentone(101);

		// update student
//		st.setsName("manohar");
//		st.setsCource("react");
//		stu.updatestudent(st);
//		System.out.println("updated sucessfull");
	

    
    }
}