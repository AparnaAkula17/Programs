package example;

import java.util.Scanner;
class Count
{
	public static String getWord(String str)
	{
		int max=0,cv=0;
		String res="";
		int count=1;
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			cv=0;
			for(int j=0;j<s[i].length();j++)
			{
				if(s[i].charAt(j)=='a'||s[i].charAt(j)=='A'||s[i].charAt(j)=='e'||s[i].charAt(j)=='E'||s[i].charAt(j)=='i'||s[i].charAt(j)=='I'||s[i].charAt(j)=='o'||s[i].charAt(j)=='O'||s[i].charAt(j)=='u'||s[i].charAt(j)=='U')
					cv++;
			}
			if(cv>max)
			{
				max=cv;
				res=s[i];
			}
			//System.out.println(s[i]);
		}
		return res;
	}
}

