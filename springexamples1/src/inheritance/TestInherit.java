package inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springexamples1.QuestionBank;

public class TestInherit
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("inheritBean.xml");
		Employee e=(Employee)context.getBean("myEmployeeBean");
		e.showData();
	}

}
