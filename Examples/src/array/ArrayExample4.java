package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayExample4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar3=new ArrayList();
		ar3.add("Black");
		ar3.add("White");
		ar3.add("Pink");
		ar3.add("Skyblue");
		System.out.println(ar3);
		
		ar3.add(0,"Red");
		System.out.println("To insert an element into the array list at the first position.");
		System.out.println(ar3);
		
		System.out.println("To retrieve an element at a specified index");
		System.out.println(ar3.get(0));
		
		ar3.set(1,"Yellow");
		System.out.println("To update specific array element by given element");
		System.out.println(ar3);
		
		ar3.remove(2);
		System.out.println("To remove the third element from a array list");
		System.out.println(ar3);
		
		System.out.println("To search an element in a array list.");
		if(ar3.contains("Yellow"))
			System.out.println("Found");
		else
			System.out.println("Not Found   ");
		
		Collections.sort(ar3);
		System.out.println("To sort a given array list");
		System.out.println(ar3);
		
		List<String> ar4=ar3.subList(0,2);
		System.out.println("To extract a portion of a array list");
		System.out.println(ar4);
		
		ar3.set(1,"Violet");
		System.out.println("To replace the second element of a ArrayList with the specified element.");
		System.out.println(ar3);
		
		System.out.println("To print all the elements of a ArrayList using the position of the elements.");
		for(int i=0;i<ar3.size();i++)
			System.out.println(ar3.get(i));
	}
}
