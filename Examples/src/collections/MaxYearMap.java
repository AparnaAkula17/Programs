package collections;


import java.util.*;
import java.util.Scanner;
public class MaxYearMap {

public static void main(String[] args) {
// TODO Auto-generated method stub
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of entries");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
        System.out.println("enter the year");
        int y=sc.nextInt();
        System.out.println("enter the number of admisiions");
        int a=sc.nextInt();
        m.put(y,a);
        }
        Set keys=m.entrySet();
        Iterator itr=keys.iterator();
        int max=0;
        int temp=0;
        int tyear=0;
        while(itr.hasNext())
        {
        Map.Entry entry=(Map.Entry)itr.next();
        temp=(Integer) entry.getValue();
        if(temp>max)
        {
        max=temp;
        tyear=(Integer)entry.getKey();
        }
        }
        System.out.println("the details of max add are");
        System.out.println("yea:"+tyear+"number of addmisins"+max);
}

}
