interface Mathematics
{
	public int add(int a,int b);
	
}
public class AddInterface
{
	public static void main(String args[])
	{
		Mathematics m = (a,b) -> a+b;
		System.out.println(m.add(10,20));
		System.out.println(m.add(15,20));
	}

	
}
