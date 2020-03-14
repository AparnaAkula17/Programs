package interexamples;

import java.util.ArrayList;
import java.util.function.Predicate;
 class Employee
 {
	 String name;
	 String desg;
	 float sal;
	 String city;
	public Employee(String name, String desg, float sal, String city)
	{
		super();
		this.name = name;
		this.desg = desg;
		this.sal = sal;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", desg=" + desg + ", sal=" + sal + ", city=" + city + "]";
	}
	public boolean equals(Object obj)
	{
		Employee e=(Employee) obj;
		if(desg.equals(e.desg) && name.equals(e.name) && sal<=e.sal && city.equals(e.city) )
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
public class EmployeePredicate {
	public static void main(String[] args)
	{
		Employee e1=new Employee("Durga","CEO",30000,"Hyderabad");
		Employee e2=new Employee("Sunil","Manager",20000,"Hyderabad");
		Employee e3=new Employee("Malli","Manager",20000,"Bangalore");
		Employee e4=new Employee("Kishore","Lead",15000,"Hyderabad");
		Employee e5=new Employee("Karan","Lead",15000,"Bangalore");
		Employee e6=new Employee("Anil","Developer",15000,"Hyderabad");
		Employee e7=new Employee("Kanura","Developer",10000,"Hyderabad");
		Employee e8=new Employee("Sunil","Developer",10000,"Bangalore");
		
		Predicate<Employee> p1=emp-> emp.desg.equals("Manager");
		
		Predicate<Employee> p2=emp-> emp.city.equals("Bangalore");
		
		Predicate<Employee> p3=emp-> emp.sal<20000;
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		display(p1,list);
	}
	public static void display(Predicate<Employee> p,ArrayList<Employee> List)
	{
		for(Employee e:List)
		{
			if(p.test(e))
			{
				System.out.println(e);
			}
		}
	}

}
