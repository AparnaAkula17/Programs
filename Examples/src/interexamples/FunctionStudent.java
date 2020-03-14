package interexamples;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Student
{
	String name;
	int marks;
	public Student(String name, int marks)
	{
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
}
public class FunctionStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list=new ArrayList<Student>(); 
		
		Student s1=new Student("Appu",100);
		Student s2=new Student("Sravanthi",90);
		Student s3=new Student("Vanya",80);
		Student s4=new Student("Mouni",70);
		Student s5=new Student("Navya",60);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Predicate<Student> p= stu->stu.marks>=60;
		System.out.println(p.test(s1));  //true
		
		Function<Student,String> f1 = stu->
								{
									if(stu.marks>=80)
									{
										return "A-Distinction";
									}
									else if(stu.marks>=60)
									{
										return "B-First Class";
									}
									else if(stu.marks>=50)
									{
										return "C-Second Class";
									}
									else if(stu.marks>=35)
									{
										return "D-Third Class";
									}
									else
										return "E-Failed";
								};
								
		Consumer<Student> c= stu->{
									System.out.println("Student Name:" +stu.name);
									System.out.println("Student Marks:" +stu.marks);
									System.out.println("Student Grade:" +f1.apply(stu));
									System.out.println();
								  };
		for(Student stu : list)
		{
			if(p.test(s3))
				c.accept(s3);
		}	
		/*
		public static void display(Function<Student,String> f1,ArrayList<Student> List)
		{
			for(Student s:list)
			{
				if(f1.apply(s))
				{
					System.out.println(s);
				}
			}
		} */
	}
	
}
