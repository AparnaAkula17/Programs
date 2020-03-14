package unittesting;

import org.junit.Test;

public class MyTest1
{
	@Test(expected=StringIndexOutOfBoundsException.class)
	public void testException()
	{
		int a=10,b=2,c=a/b;
		System.out.println(c);
		String str="Hello";
		System.out.println(str.charAt(9));
	}
}
