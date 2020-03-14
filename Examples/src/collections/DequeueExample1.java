package collections;

import java.util.PriorityQueue;

class Student4
{
	String htno;
	String name;
	public Student4(String htno, String name)
	{
		super();
		this.htno = htno;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Student [htno=" + htno + ", name=" + name + "]";
	}
	public int compareTo(Student4 s)
	{
		if(name.compareTo(s.name)<0)
			return -1;
		else if(name.compareTo(s.name)>0)
			return 1;
		else
			return 0;
	}
}

public class DequeueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue d=new PriorityQueue();
		PriorityQueue<Student4> d1=new PriorityQueue<Student4>();
		Student4 s1=new Student4("001","Appu");
		Student4 s2=new Student4("002","sijju");
		
		d1.add(s1);
		d1.add(s2);
		System.out.println(d1);
		
	}

}
