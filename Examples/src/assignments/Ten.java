package assignments;

import java.util.Scanner;

public class Ten {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a color");
	String str=s.nextLine();
	if(str.matches("(#)[A-F0-9]{6}"))
	System.out.println("valid color");
	else
	System.out.println("invalid color");
	}
}

