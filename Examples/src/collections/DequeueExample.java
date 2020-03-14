package collections;

import java.util.*;

public class DequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue d=new PriorityQueue();
		d.add(10);
		d.add(20);
		d.add(4);
		d.add(16);
		System.out.println(d);
		d.remove();
		System.out.println("After removal:");
		System.out.println(d);
		d.add(9);
		System.out.println(d);
		d.remove();
		System.out.println(d);
		
		/*
		d.add("India");
		d.add("Japan");
		d.add("China");
		d.add("Swedan");
		System.out.println(d);
		d.remove();
		System.out.println("After removal:");
		System.out.println(d);
		d.add("Canada");
		System.out.println(d);
		d.remove();
		System.out.println(d); */
		
	
	}

}
