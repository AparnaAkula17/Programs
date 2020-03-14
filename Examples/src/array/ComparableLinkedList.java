package array;

import java.util.LinkedList;
import java.util.Collections;
import java.util.ArrayList;

class Student2 implements Comparable<Student2>
{
	String htno;
	String name;
	public Student2(String htno, String name) 
	{
		super();
		this.htno = htno;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Student2 [htno=" + htno + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student2 student)
	{
		if(name.compareTo(student.name)<0)
			return -1;
		else if(name.compareTo(student.name)>0)
			return 1;
		else
			return 0;
	}
}
class Employee2
{
	String eid;
	String name;
	public Employee2(String eid, String name)
	{
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Employee2 [eid=" + eid + ", name=" + name + "]";
	}
}
public class ComparableLinkedList {

	private static LinkedList lr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("123","Praveen");
		Student s2=new Student("456","Appu");
		Student s3=new Student("789","Sravanthi");
		LinkedList lr = new LinkedList();
		lr.add(s1);
		lr.add(s2);
		lr.add(s3);
		System.out.println(lr);
		Collections.sort(lr);
		lr.forEach(System.out::println);
		
		
		Employee e1=new Employee("001","Jahnavi");
		Employee e2=new Employee("002","Vanya");
		Employee e3=new Employee("003","Mouni");
		lr.add(e1);
		lr.add(e2);
		lr.add(e3);
		//System.out.println(lr);
	}

}
