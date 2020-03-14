package jdbcPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeMain 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new   ClassPathXmlApplicationContext("applicationContext.xml");  
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		/*List<Employee> employee=dao.getEmployee();
		Iterator<Employee> itr=employee.iterator();
		for(Employee e:employee)
		{
			System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getDept()+" "+e.getDesg()+" "+e.getEmail());
		}
		dao.getEmployee();*/
		
		// insert record if it is not exists in the table
		Scanner sc=new Scanner(System.in);
		System.out.println("enter details of students");
		System.out.println("enter id");
		String empid=sc.next();
		System.out.println("enter name:");
		String ename=sc.next();
		System.out.println("enter department:");
		String dept=sc.next();
		System.out.println("enter designation:");
		String desg=sc.next();
		System.out.println("enter email:");
		String email=sc.next();
		Employee e=new Employee();
		e.setEmpid(empid);
		e.setEname(ename);
		e.setDept(dept);
		e.setDesg(desg);
		e.setEmail(email);
		int res=dao.addEmployee(e);
		if(res==0) 
		{
			System.out.println("record alredy exist with this id");
		}
		else
			System.out.println("record inserted...");
	}
}


