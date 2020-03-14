package webapp;

public class UserMainCode2 {
	public static String findNature(int a,int b,int c)
	{
		int n=(b*b)-(4*a*c);
		if(n>0)
			return ("Roots are Real and Distinct");
		else if(n==0)
			return ("Roots are Real and Equal");
		else 
			return ("Roots are imaginary");
	}

}
