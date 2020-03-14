package webapp;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.next();
		System.out.println(UserMainCode.countVowels(string));
	}

}
