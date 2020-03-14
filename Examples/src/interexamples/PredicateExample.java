package interexamples;

import java.util.function.Predicate;

interface TestNumber{
	public boolean teststr(int x);
}
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = i ->(i%2!=0);
				System.out.println(p1.test(11));
	}

}
