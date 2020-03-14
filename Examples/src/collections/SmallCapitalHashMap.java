package collections;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SmallCapitalHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		ArrayList<String>  ar= new ArrayList<String>();
		hm1.put(001,"Appu");
		hm1.put(002,"appU");
		hm1.put(003,"appu");
		hm1.put(004,"aPpU");
		hm1.put(005,"appu");
		hm1.put(006,"appU");
		
		Set keys=hm1.entrySet();
		Iterator itr1=keys.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry) itr1.next();
			String str=(String) me.getValue();
			if(str.charAt(0)>=97 && 
			   str.charAt(0)<=123 &&
			   str.charAt(str.length()-1)>=65 &&
			   str.charAt(str.length()-1)<=90)
				ar.add(str);
		}
	System.out.println("The names satisfying the condition are:");
	for(String c:ar)
		System.out.println(c);
	}
}
