package springexamples1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonSetter 
{
public static void main(String[] args) 
	{
// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("setterBean.xml");
		Person q1=(Person)context.getBean("qb");
		q1.showData();
	}
}
