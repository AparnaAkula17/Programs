package interexamples;

import java.util.function.Predicate;

public class PredicateExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Sunny","Karan","Malli","Khan","Kishore"};
		Predicate<String> p = str->str.charAt(0)=='K';
		{
			for(String n:names)
			{
				if(p.test(n))
				{
					System.out.println(n);
				}
			}
		}
	}

}
