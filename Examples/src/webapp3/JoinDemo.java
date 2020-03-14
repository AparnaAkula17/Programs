package webapp3;

class HelloThread extends Thread{
	public void run() {
		for(int i=1;i<=50;i++)
		{
			System.out.println("Hello Thread");
		}
		try {
			sleep(0);
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException
	{
		HelloThread h1=new HelloThread();
		h1.start();
		h1.join();
		for(int i=101;i<=150;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
