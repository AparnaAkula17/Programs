package collections;

import java.util.*;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		Consumer<Integer> consumer = x->{
											if(x%2==0)
												System.out.println(x+" is Even Number");
											else
												System.out.println(x+" is Odd Number");
										};
		ar.add(10);
		ar.add(17);
		ar.add(3);
		ar.add(16);
		ar.add(13);
		ar.stream().forEach(consumer);
	}

}
