package webapp3;
import java.util.Scanner;
public class ExceptionAssignment4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number a");
		int a=s.nextInt();
		System.out.println("Enter Number b");
		int b=s.nextInt();
		ExceptionAssignment4 z=new ExceptionAssignment4();
		z.division(a, b);
	}
	public void division(int a,int b) throws ArithmeticException
	{
		try 
		{
			float c=a/b;
			System.out.println("The result is:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
