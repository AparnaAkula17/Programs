package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar3=new ArrayList();
		ar3.add("Black");
		ar3.add("White");
		ar3.add("Pink");
		ar3.add("Skyblue");
		System.out.println(ar3);
		
		Iterator itr=ar3.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
