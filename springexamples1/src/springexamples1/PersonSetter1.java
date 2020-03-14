package springexamples1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonSetter1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("setterBean1.xml");
		Person1 p1=(Person1)context.getBean("setperson");
		p1.showData();
	}
}
