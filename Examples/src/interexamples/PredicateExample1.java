package interexamples;

import java.util.function.Predicate;

public class PredicateExample1 {
	public static void main(String[] args)
	{
		Predicate<Integer> p=I ->(I>10);
		Predicate<Integer> p1 = I ->(I%2==0);
		Predicate<String>  p2= str ->(str.length()>=3);
		Predicate<Integer> p3= i ->{  boolean flag=true;
										for(int x=2;x<=i/2;x++)
										{
											if(i%x==0)
												flag=false;
												break;
										}
										return flag;
										};
		Predicate<String> p4= str -> (str.charAt(0)=='A');	 
		System.out.println(p.test(11));
		System.out.println(p.test(2));
		System.out.println(p1.test(11));
		System.out.println(p1.test(2));
		System.out.println(p2.test("abc"));
		System.out.println(p2.test("pqrst"));
		System.out.println(p3.test(11));
		System.out.println(p3.test(4));
		System.out.println(p4.test("Abc"));
		System.out.println(p4.test("pqr"));
	}
}
