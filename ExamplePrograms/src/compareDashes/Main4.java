package compareDashes;

import java.util.Scanner;

public class Main4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int n = sc.nextInt();
		System.out.println(UserMainCode4.repeatFirstThreeCharacters(s1, n));
	}
}
class UserMainCode4
{
	public static StringBuffer repeatFirstThreeCharacters(String s1,int n)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++)
		{
			if(s1.length()>=3)
				sb.append(s1.substring(0,3));
			else
				sb.append(s1.substring(0,s1.length()));
		}
		return sb;
	}
}
