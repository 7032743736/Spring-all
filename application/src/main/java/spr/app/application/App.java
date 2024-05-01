package spr.app.application;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class App 
{
    public static void main( String[] args )
    {
         Resource res= new ClassPathResource("SpringConfig.xml");
    	XmlBeanFactory factory=new XmlBeanFactory(res);
    	BeanClass myBean=(BeanClass) factory.getBean("add");
    	myBean.printadd();
    }
}
