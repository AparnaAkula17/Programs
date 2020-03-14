package webapp3;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread execution begins...");
		for(int i=101;i<=200;i++)
			System.out.println(i);
		System.out.println("End of Thread execution.. ");
	}
}

public class ThreadExample {
	public static void main(String[] args)
	{
		MyThread t= new MyThread();
		System.out.println("Main method started execution...");
		t.start();
		for(int j=1;j<=100;j++)
			System.out.println(j);
		System.out.println("Main method completed execution...");
	}
}
