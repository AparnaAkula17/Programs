package array;

import java.util.LinkedList;
import java.util.Iterator;

class Student1
{
	String htno;
	String name;
	public Student1(String htno, String name) 
	{
		super();
		this.htno = htno;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Student1 [htno=" + htno + ", name=" + name + "]";
	}
}
class Employee1
{
	String eid;
	String name;
	public Employee1(String eid, String name)
	{
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Employee1 [eid=" + eid + ", name=" + name + "]";
	}
}
public class LinkedListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("123","Praveen");
		Student s2=new Student("456","Appu");
		Student s3=new Student("789","Sravanthi");
		LinkedList ar=new LinkedList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println(ar);
		
		
		//Iterator itr=ar.iterator();
		//while(itr.hasNext())
		//	System.out.println(itr.next());	
		/*for(Student s:ar)
		{
			System.out.println(s.htno+" "+s.name);
		}*/
		// ar.forEach(System.out::println);
		
		Employee e1=new Employee("001","Jahnavi");
		Employee e2=new Employee("002","Vanya");
		Employee e3=new Employee("003","Mouni");
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		//System.out.println(ar);
	}

}
