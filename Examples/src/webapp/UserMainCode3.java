package webapp;

public class UserMainCode3 {
	public static boolean isPrime(int n)
	{
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
			}
		}
		return flag;
	}
}
