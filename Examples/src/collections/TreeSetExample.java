package collections;

import java.util.HashSet;
import java.util.TreeSet;

class Emply1 implements Comparable<Emply1>
{
	String num;
	String name;
	public Emply1(String num, String name)
	{
		super();
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return "Emply1 [num=" + num + ", name=" + name + "]";
	}
	public int compareTo(Emply1 emp)
	{
		if(name.compareTo(emp.name)<0)
			return -1;
		else if(name.compareTo(emp.name)>0)
			return 1;
		else
			return 0;
	}
}
public class TreeSetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add("India");
		ts.add("China");
		ts.add("Japan");
		ts.add("Swedan");
		System.out.println(ts);
		
		TreeSet ts1=new TreeSet();
		ts1.add(new Emply1("101","Kumar"));
		ts1.add(new Emply1("102","Appu"));
		ts1.add(new Emply1("103","Sravanthi"));
		//System.out.println(ts1);
		ts1.forEach(System.out::println);
	}
}
