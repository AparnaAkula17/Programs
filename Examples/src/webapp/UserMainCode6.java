package webapp;

public class UserMainCode6 {
	public static int compareResult(int[] a,int[] b) 
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					sum=sum+a[i];
				}
			}
		}
		return sum;
	}

}
