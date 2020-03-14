package exam;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class InitWelcome implements BeanPostProcessor 
{
  public Object postProcessBeforeInitialization(Object bean, String beanName)
     throws BeansException 
  {
     System.out.println("Before Initialization : " + beanName);
     return bean;
  }
  public Object postProcessAfterInitialization(Object bean, String beanName)
     throws BeansException
  {
     System.out.println("After Initialization : " + beanName);
     return bean;
  }
}