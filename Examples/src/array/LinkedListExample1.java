package array;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ar=new LinkedList();
		int[] a= {10,20,30,40,50};
		ar.add("Java");
		ar.add("Selinium");
		ar.add("Dotnet");
		ar.add("Oracle");
		System.out.println(ar);
		LinkedList ar1=new LinkedList();
		ar1.add("Datascience");
		ar1.add("Python");
		ar1.add("Bigdata");
		ar.forEach(System.out::println);
		ar.addAll(ar1);
		System.out.println(ar);
		ar1.add("ruby");
		if(ar.containsAll(ar1))
			System.out.println("element found");
		else
			System.out.println("element not found");
	}

}
