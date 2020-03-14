package webapp;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a");
		int a = scanner.nextInt();
		System.out.println("enter b");
		int b = scanner.nextInt();
		System.out.println("enter c");
		int c = scanner.nextInt();
		System.out.println(UserMainCode2.findNature(a,b,c));
	}

}
