package interexamples;

import java.util.function.Predicate;

interface TestPrime{
	public boolean isPrime(int x);
}
public class PredicateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPrime p3= i ->{  boolean flag=true;
		for(int x=2;x<=i/2;x++)
		{
			if(i%x==0)
				flag=false;
				break;
		}
		return flag;
		};
		System.out.println(p3.isPrime(11));
	}

}
