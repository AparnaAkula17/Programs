package webapp;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array a Size");
		int n=scanner.nextInt();
		System.out.println("Enter a Array");
		int a[]=new int[10];
		for(int i=0;i<n;i++)
		{
			a[i] =scanner.nextInt();
		}
		System.out.println("Enter Array b Size");
		int m=scanner.nextInt();
		System.out.println("Enter b Array");
		int b[]=new int[10];
		for(int j=0;j<m;j++)
		{
			b[j] =scanner.nextInt();
		}
		System.out.println(UserMainCode6.compareResult(a,b));
	}

}
