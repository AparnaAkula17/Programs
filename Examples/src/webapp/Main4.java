package webapp;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=scanner.nextInt();
		System.out.println("Enter Array");
		int array[]=new int[10];
		for(int i=0;i<n;i++)
		{
			array[i] =scanner.nextInt();
		}
		System.out.println("Enter search element");
		int k=scanner.nextInt();
		System.out.println(UserMainCode4.findElement(array,k));
	}

}
