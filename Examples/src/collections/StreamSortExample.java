package collections;

import java.util.ArrayList;
import java.util.*;

public class StreamSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(17);
		ar.add(3);
		ar.add(16);
		ar.add(13);
		ar.add(13);
		//ar.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		long cnt=ar.stream().distinct().count();
		System.out.println(cnt);
	}

}
