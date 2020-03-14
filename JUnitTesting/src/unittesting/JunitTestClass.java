package unittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTestClass 
{
	@Before
	public void beforeClassBegins()
	{
		System.out.println("This method will be execute before beggining of classes");
	}
	@After
	public void afterClassBegins()
	{
		System.out.println("This method will be execute after beggining of classes");
	}
	
	@Test
	public void test1()
	{
		System.out.println("This is my test1");
	}
	@Before
	public void preMethod()
	{
		System.out.println("This will be executed before test case");
	}
	@Test
	public void test2()
	{
		System.out.println("This is my test2");
	}
	@After
	public void postMethod()
	{
		System.out.println("This will be executed after test case");
	}
	@Test(timeout=3000)
	public void test3()
	{
		System.out.println("This is my test3");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
