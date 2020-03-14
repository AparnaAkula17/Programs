package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


class Course
{
	String s1;
	String s2;
	String s3;
	public Course(String s1, String s2, String s3)
	{
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
}
public class ClgHashMapExmaple {
	
	public static void main(String[] args) {
		HashMap<String,Course> hm=new HashMap<String,Course>();
		
		hm.put("JNTU",new Course("ece","cse","civil"));
		hm.put("SVU",new Course("ece","eee","mec"));
		hm.put("AU",new Course("it","cse","ce"));
		
		System.out.println("Mention the course");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		Set keys=hm.entrySet();
		Iterator itr=keys.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry) itr.next();
			Course depts=(Course)me.getValue();
			if(depts.s1.equals(s) || depts.s2.equals(s) || depts.s3.equals(s))
				System.out.println(me.getKey());
		}	
	}
}
