package jdbcprograms;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomMain 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao=(EmployeeDao)context.getBean("edao");
		Employee emp=new Employee();
		emp.setEmpid("1006");
		emp.setEname("Sravanthi");
		emp.setDept("Testing");
		emp.setDesg("Tester");
		emp.setEmail("sravanthisanaka@gmail.com");
		 /*
		int status=dao.saveEmployee(emp);
		System.out.println(status);
		System.out.println("Record Inserted");
		*/
		 
		/*
		Employee e=new Employee(); 
	    e.setEmpid("1002"); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);
	    */
	    /*
	    int st=dao.updateEmployee(new Employee("Sijju","Development","B.Tech","sadhusreeja@gmail.com"));
	    Employee e=new Employee(); 
	    e.setEmpid("1004"); 
	    int status=dao.updateEmployee(e); 
	    System.out.println(status);*/
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao"); 
	    
	    List<Employee> employee =dao.getEmployee();
		 
		Iterator<Employee> itr=employee.iterator();
		for(Employee e:employee)
		{
			System.out.println(e.getEmpid()+" " +e.getEname()+" "+e.getDept()+" "+e.getDesg()+" "+e.getEmail());
		}
	
		dao.getEmployee();

	}

}
