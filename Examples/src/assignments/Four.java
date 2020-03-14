package assignments;

import java.util.Scanner;
import java.util.*;

public class Four {
	/*4. Write a program to read a string and a positive integer n as input and 
	construct a string with first n and last n characters in the given string*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		sb.append(str.substring(0,n));
		sb.append(str.substring(str.length()-n));
		System.out.println("The first n and last n characters in the given string are:" +sb.toString());
	}

}
