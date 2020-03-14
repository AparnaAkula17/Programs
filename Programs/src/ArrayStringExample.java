import java.util.*;

public class ArrayStringExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList ar=new ArrayList();
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			ar.add(sc.next());
		}
		System.out.println(ar);
		Iterator itr=ar.iterator();
		int max=0;
		String topper="";
		while(itr.hasNext())
		{
			String temp=(String) itr.next();
			StringTokenizer stk=new StringTokenizer(temp,"-");
			String name=stk.nextToken();
			int m1=Integer.parseInt(stk.nextToken());
			int m2=Integer.parseInt(stk.nextToken());
			int m3=Integer.parseInt(stk.nextToken());
			int total=m1+m2+m3;
			if(total>=max)
			{
				max=total;
				topper=name;
			}
		} 
		System.out.println("The total is:" +max);
		System.out.println("The topper is:" +topper);
	}

}
