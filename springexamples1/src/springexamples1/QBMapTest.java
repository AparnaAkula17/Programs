package springexamples1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QBMapTest  
{
	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		ApplicationContext context1=new ClassPathXmlApplicationContext("QBMap.xml");
		QBMap q2=(QBMap)context1.getBean("qbmap");
		q2.showAnswers();
	}
}
