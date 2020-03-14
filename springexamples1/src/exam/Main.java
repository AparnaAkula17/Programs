package exam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
  public static void main(String[] args) {
     AbstractApplicationContext context = new ClassPathXmlApplicationContext("welcome.xml");

     Welcome a = (Welcome) context.getBean("welcome");
     a.getMessage();
     context.registerShutdownHook();
  }
}