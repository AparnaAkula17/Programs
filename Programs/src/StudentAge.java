

import java.util.TreeSet;
import java.util.stream.Collectors;

class Student5 implements Comparable<Student5>
{
	String name;
	String age;
	String city;
	public Student5(String name, String age, String city) 
	{
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	@Override
	public String toString() 
	{
		return "Student5 [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	public int compareTo(Student5 stu)
	{
		if(age.compareTo(stu.age)<0)
			return 1;
		else if(age.compareTo(stu.age)>0)
			return -1;
		else
			return 0;
	}
	
}
public class StudentAge {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<Student5> ts=new TreeSet<Student5>();
		ts.add(new Student5("Appu","21","Mtm"));
		ts.add(new Student5("Aparna","60","Hyd"));
		ts.add(new Student5("Sijju","22","Blr"));
		ts.add(new Student5("Shyam","55","Chn"));
		System.out.println(ts);
	}

}
