package assignments;

import java.util.Scanner;

public class Eight {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter an odd integer value");
	int n=s.nextInt();
	int i=0,es=0,os=0,sum=1;
	if(n==1)
	{
		sum=n;
	}
	for(i=3;i<=n;i+=4)
	{
		os=os+i;
	}
	for(i=5;i<=n;i+=4)
	{
		es=es+i;
	}
		sum+=os-es;
	System.out.println("The sum of series is "+sum);
	}
}


