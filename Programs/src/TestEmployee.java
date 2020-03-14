import java.util.*;

class UserMainCode
{
	public static Map increaseSalaries(int n,HashMap<Integer,String>h1,HashMap<Integer,Integer>h2)
	{
		HashMap<Integer,Integer> op=new HashMap<Integer,Integer>();
		Set keys=h1.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			int id=(int) itr.next();
			String s=h1.get(id);
			if(s.equals("manager"))
			{
				int newsal=h2.get(id)+5000;
				op.put(id,newsal);
			}
		}
		return op;
	}
}
public class TestEmployee 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		HashMap<Integer,Integer> h2=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> h3=new HashMap<Integer,Integer>();
		
		System.out.println("Enter Number of Employees");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int id=sc.nextInt();
			h1.put(id,sc.next());
			h2.put(id,sc.nextInt());
		}
		
		h3=(HashMap<Integer,Integer>)UserMainCode.increaseSalaries(n,h1,h2);
		System.out.println(h3);
	}
}

