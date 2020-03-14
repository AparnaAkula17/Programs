package webapp3;

import java.util.Scanner;

public class ExceptionAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter index of the array that is to be displayed");
		int i=s.nextInt();
		try
		{
			System.out.println("array element is" +a[i]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array element not found");
		}
	}

}
