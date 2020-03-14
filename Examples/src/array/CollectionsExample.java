package array;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		int[] a= {10,20,30,40,50};
		ar.add("Java");
		ar.add("Selinium");
		ar.add("Dotnet");
		
		System.out.println("Original order is:");
		System.out.println(ar);
		
		Collections.sort(ar);
		System.out.println("Sorted order is:");
		System.out.println(ar); 
		
		Collections.reverse(ar);
		System.out.println("Reverse order is:");
		System.out.println(ar); 
		
		/*Collections.fill(ar, "language");
		System.out.println("After Filling in ar List");
		System.out.println(ar);*/
		
		ArrayList ar1=new ArrayList();
		ar1.add("Java");
		ar1.add("Selinium");
		ar1.add("Dotnet");
		boolean flag=Collections.disjoint(ar, ar1);
		System.out.println(flag);
				
		/*ArrayList ar1=new ArrayList(5);
		Collections.copy(ar1, ar);
		System.out.println("Elements in new ArrayList are");
		System.out.println(ar1);*/		
		
		/*ArrayList ar1=new ArrayList();
		ar1.add("Datascience");
		ar1.add("Python");
		ar1.add("Bigdata");*/
		
	}

}
