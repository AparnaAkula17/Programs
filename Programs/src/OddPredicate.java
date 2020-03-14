import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;


public class OddPredicate 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Predicate <Integer> p1=i ->(i%2!=0);
		System.out.println(p1.test(11));
		System.out.println(p1.test(10));
		System.out.println(p1.test(17));
		
		
		Function<Integer,Double> area= a->(3.14*a*a);
		System.out.println("Area of circle is:"+area.apply(3));
		
		BiFunction<Integer,Integer,Integer> max= (c,d) -> (c>d?c:d);
		System.out.println("Max number is:"+max.apply(8,9));
		
	}

}
