package array;

import java.util.ArrayList;

public class ArrayExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar4=new ArrayList();
		ar4.add("Java");
		ar4.add("Selinium");
		ar4.add("Dotnet");
		ar4.add("Oracle");
		
		ArrayList ar5=new ArrayList();
		ar5.add("Datascience");
		ar5.add("Python");
		ar5.add("Bigdata");
		
		ar4.addAll(ar5);
		System.out.println("Join two array lists ");
		System.out.println(ar4);
		
		
	}

}
