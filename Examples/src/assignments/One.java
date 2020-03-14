package assignments;

import java.util.*;

public class One {
	
	//1. Write a program to check if a given string is palindrome and contains 
	//at least two different vowels.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		//String str3="";
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");
		String str1=rev;
		for(int j=0;j<str1.length();j++)
		{
			if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u')
				count++;
		}
		if(count>=2)
			System.out.println("valid");
		else
			System.out.println("Invalid");
		
	}
}
