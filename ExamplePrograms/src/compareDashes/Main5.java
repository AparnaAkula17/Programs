package compareDashes;

import java.util.Scanner;
class UserMainCode5
{
	public static boolean validateExp(String year,String exp)
	{
		boolean b = false;
		int cyear=2015;
		int s1=Integer.parseInt(year);
		int s2=Integer.parseInt(exp);
		if((cyear-s1)>=s2)
		{
			b=true;
		}
		return b;
	}
}
public class Main5 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String year=s.next();
		String exp=s.next();
		boolean res=UserMainCode5.validateExp(year,exp);
		if(res)
		System.out.println("True");
		else
		System.out.println("False");
	}
}