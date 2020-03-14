package webapp3;
import java.util.Scanner;
public class ExceptionAssignment1 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an Integer value");
		String str=s.nextLine();
		int x=Integer.parseInt(str);
		try
		{
			System.out.println("The square of the value is:"+x*x);
			System.out.println("Thw work has been done successfully");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered input is not in a valid format");
		}
}
}

