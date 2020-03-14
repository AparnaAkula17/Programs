package compareDashes;

import java.util.Scanner;
import java.util.StringTokenizer;
class UserMainCode1
{
public static int compareDashes(String s1,String s2)
{
	int i=0,j=0,count=0;
	int a=s1.length();
	int b=s2.length();
	int l1[]=new int[a];
	int l2[]=new int[b];
	StringTokenizer st1=new StringTokenizer(s1,"-");
	StringTokenizer st2=new StringTokenizer(s2,"-");
	while(st1.hasMoreElements())
	{
		String c=st1.nextToken();
		l1[i]=c.length();
		i++;
	}
	while(st2.hasMoreElements())
	{
		String d=st2.nextToken();
		l2[j]=d.length();
		j++;
	}
	for(int k=0;k<i;k++)
	{
		if(l1[k]==l2[k])
		{
			count++;
			break;
		}
	}
	if(count==1)
	{
		return 1;
	}
	else
	{
		return 2;
	}
	}
}
public class Main1 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two Strings:");
		String s1=s.nextLine();
		String s2=s.nextLine();
		int res=UserMainCode1.compareDashes(s1,s2);
		if(res==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}