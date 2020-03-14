package collections;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class TempEmp
{
	String name;
	double salary;
	public TempEmp(String name, double salary)
	{
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return "TempEmp [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class BiConsumerUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<TempEmp> te=new ArrayList();
		
		te.add(new TempEmp("Appu",1000));
		te.add(new TempEmp("Sijju",2000));
		te.add(new TempEmp("Srija",3000));
		
		BiConsumer<TempEmp,Double> c=(e,d) -> e.salary=e.salary+d;
		
		for(TempEmp e:te)
		{
			c.accept(e, 500.0);
		}
		
		for(TempEmp e:te)
		{
			System.out.println("Employee Name:"+e.name);
			System.out.println("Employee Salary:"+e.salary);
			System.out.println();
		}
	}

}
