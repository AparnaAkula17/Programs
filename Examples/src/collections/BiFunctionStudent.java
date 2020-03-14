package collections;

import java.util.function.BiFunction;

class Student
{
	String htno;
	String name;
	public Student(String htno, String name)
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
	
}

public class BiFunctionStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,Student> bi=(htno,name) -> new Student(htno,name);
		
		Student s1=bi.apply("1001","Appu");
		Student s2=bi.apply("1002","Sravanthi");
		System.out.println(s2);
	}

}
