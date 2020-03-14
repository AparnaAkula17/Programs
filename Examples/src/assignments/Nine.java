package assignments;

import java.util.Scanner;

public class Nine {
	/*9. Write code to get the sum of all the digits present in the given string.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.nextLine();
		int sum = 0;
	    for (int i = 0; i < s1.length(); i++) 
	    {
	      char a = s1.charAt(i);
	      if (Character.isDigit(a))
	      {
	        int b = Integer.parseInt(String.valueOf(a));
	        sum = sum + b;
	      }
	    }
	    if (sum == 0) 
	      System.out.println(-1);
	    else
	      System.out.println(sum);
	  }

}

