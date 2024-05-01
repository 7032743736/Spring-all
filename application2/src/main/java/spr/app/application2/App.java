package spr.app.application2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class App 
{
    public static void main( String[] args )
    {
       Resource rs= new ClassPathResource("SpringConfig.xml");
       XmlBeanFactory fact=new XmlBeanFactory(rs);
       BeanClass2 mybean= (BeanClass2) fact.getBean("multi");
       mybean.printmul();
    }
}
