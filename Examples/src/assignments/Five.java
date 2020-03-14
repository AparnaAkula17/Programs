package assignments;

import java.util.Scanner;

public class Five {
	/*5. Write a program to read a positive number as input and to get the reverse 
	of the given number and return it as output (including zeros)*/
	public static void main(String[] args) {
		int rem=0;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse of a number is:"+rev);
	}
}
