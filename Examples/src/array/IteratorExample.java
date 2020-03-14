package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("Java");
		ar.add("Selinium");
		ar.add("Dotnet");
		//System.out.println(ar);
		/*Iterator itr=ar.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());	*/
		ListIterator ltr=ar.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("Elements in Reverse Order");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}
}
