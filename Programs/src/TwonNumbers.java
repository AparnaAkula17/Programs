import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TwonNumbers 
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Entries");
		int n= sc.nextInt();
        for(int i=0;i<n;i++) 
        {
        	System.out.println("Enter your keys");
        	int k=sc.nextInt();
        	System.out.println("Enter your keys");
        	int v=sc.nextInt();
        	h.put(k, v);
        }
        Set entries=h.entrySet();
        Iterator itr=entries.iterator();
        int count=0;
        int sum=0;
        while(itr.hasNext()) 
        {
        	Map.Entry m=(Map.Entry)itr.next();
        	int k=(int) m.getKey();
        	int value=0;
        	if(k%2!=0) 
        	{
        		count++;
        		value=(Integer) m.getValue();
        		sum=sum+value;
        	}
        }
        int avg=sum/count;
        System.out.println(avg);

      }
}
    

	
	
	
	
	