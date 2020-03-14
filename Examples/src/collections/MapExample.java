package collections;

import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		Object rest=hm.put("k1","India");
		hm.put("k2","Japan");
		hm.put("k3","Swedan");
		hm.put("k4","America");
		//Object obj=hm.put("k1","China");
		Object obj=hm.putIfAbsent("k1","canada");
		System.out.println(obj);
		System.out.println(rest);
		Object r=hm.remove("k2");
		System.out.println(r);
		System.out.println("After removal is:");
		System.out.println(hm);
		Set keys=hm.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Set entries=hm.entrySet();
		Iterator itr1=entries.iterator();
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry)itr1.next();
			//System.out.println(itr1.next());
			System.out.println(me.getKey()+"     "+me.getValue());
		}
	}

}
