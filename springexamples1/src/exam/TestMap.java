package exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap 
{
	    public static void main(String[] args) 
	    {
	        ApplicationContext cont=new ClassPathXmlApplicationContext("Dependent-bean.xml");
	        Mapping qump=(Mapping)cont.getBean("que");
	        qump.showAnswers();
	    }
}
