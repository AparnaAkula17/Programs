package example;

import java.util.Scanner;

public class CountMaxVowels 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String sz=Count.getWord(str);
	System.out.println(sz);

	}
}
