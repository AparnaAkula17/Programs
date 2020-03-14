package collections;

import java.util.HashSet;

class Emply
{
	String num;
	String name;
	public Emply(String num, String name)
	{
		super();
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Emply [num=" + num + ", name=" + name + "]";
	}
	
}
public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("India");
		hs.add("China");
		hs.add("Japan");
		hs.add("Swedan");
		hs.add(null);
		System.out.println(hs);
		
		HashSet hs1=new HashSet();
		hs1.add(new Emply("101","Kumar"));
		hs1.add(new Emply("102","Appu"));
		hs1.add(new Emply("103","Sravanthi"));
		//System.out.println(hs1);
		
		hs1.forEach(System.out::println);
	}

}
