package assignments;

import java.util.Scanner;
import java.util.*;

public class Three {
	/*3. Write a program to read a number , calculate the sum of squares of even digits (values) 
	present in the given number.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		while(n>0) 
		{
			int r=n%10;
			if(r%2== 0)
			{
				sum1=sum1+(r*r);
			}
			n=n/10;
		}
		System.out.println("The sum of squares of even digits is:" +sum1);
	}

}
