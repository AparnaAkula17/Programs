package webapp3;

class MyRunThread implements Runnable
{
	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			System.out.println(i);
		}
	}
		
}

public class RunnableTest {
	public static void main(String[] args)
	{
		Runnable r= () -> {
							for(int i=101;i<=200;i++)
								System.out.println(i);
							};
		MyRunThread myt=new MyRunThread();
		Thread t1=new Thread(r);
		Thread t2=new Thread(myt);
		t1.start();
		t2.start();
		
	}
}