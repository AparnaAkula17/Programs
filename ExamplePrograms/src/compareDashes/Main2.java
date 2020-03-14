package compareDashes;

import java.util.Scanner;

public class Main2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=UserMainCode2.getLuckySum(a,b,c);
		System.out.println(res);
	}
}
class UserMainCode2
{
	public static int getLuckySum(int a,int b,int c)
	{
		int sum=0;
		if(a==13)
			sum=c;
		else if(b==13)
			sum=a;
		else if(c==13)
			sum=a+b;
		else
			sum=a+b+c;
		return sum;
		
	}
}