//package com.spr;

//
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	 Resource res= new ClassPathResource("config.xml");
//     	XmlBeanFactory factory=new XmlBeanFactory(res);
//     	EmployeeSpring myBean=(EmployeeSpring) factory.getBean("emp");
//     	myBean.print();
//    }
//}


package com.spr;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
public class App 
{
    public static void main( String[] args )
    {
    	 Resource res= new FileSystemResource("C:\\Users\\Public\\Documents\\spcon.xml.txt");
     	XmlBeanFactory factory=new XmlBeanFactory(res);
     	EmployeeSpring myBean=(EmployeeSpring) factory.getBean("emp");
     	myBean.print();
    }
}
