package interexamples;

public class InnerClassDemo {
	public void show()
	{
		class A
		{
			public int greater()
			{
				int e[]= {11,22,33,44,55};
				int max=e[0];
				for(int i=1;i<e.length;i++)
				{
					if(max<e[i])
						max=e[i];
				}
				return (max);
			}
		}
		A obj=new A();
		System.out.println(obj.greater());
	}
}
