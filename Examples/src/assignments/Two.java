package assignments;

import java.util.*;

public class Two {
	/*2. Write a program to read a number , calculate the sum of odd digits (values) 
	present in the given number.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		while(n>0) 
		{
			int rem=n%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println("Sum of Odd digits is:" +sum);
	}

}
