package main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoImpl;
import data.Student;

public class TestStudent
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDaoImpl sdao=(StudentDaoImpl)context.getBean("edao");
		 
			//to insert record in table
		/*System.out.println("Enter student id");
		int id=sc.nextInt();
		System.out.println("Enter student name");
		String name=sc.next();
		System.out.println("Enter student age");
		int age=sc.nextInt();
		Student student=new Student();
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		sdao.create(student);*/
		/*
			//to delete a record from the student table
		System.out.println("enter id to delete data");
		int id1=sc.nextInt();
		sdao.delete(id1);
		
			//to update a record from the student table
		System.out.println("enter id to update");
		int id=sc.nextInt();
		System.out.println("enter new name");
		String name=sc.next();
		System.out.println("enter new age");
		int age=sc.nextInt();
		Student student1=new Student();
		student1.setId(id);
		student1.setName(name);
		student1.setAge(age);
		sdao.update(student1);
		*/
		 /*
		//for displaying student list
		List<Student> students=sdao.getStudents();
		for(Student s:students)
			 System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
		sdao.getStudents();
		Student stdnt=new Student();
		boolean result=sdao.saveStudentByPst(stdnt);
		System.out.println(result);*/
	}

}
