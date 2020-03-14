package configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class HelloWorldConfig
{
@Bean
	public HelloWorld helloworld()
	{
		return new HelloWorld();
	}
@Bean
	public Employee emp()
	{
		return new Employee("844359", "Aparna");
	}
}
