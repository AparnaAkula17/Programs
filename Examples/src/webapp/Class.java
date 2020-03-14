package webapp;
class Box{
	static int count;
	Box()
	{
		count++;
	}
	public void showCount()
	{
		System.out.println("The Number of objects created:" +count);
	}
}

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		b1.showCount();
		Box b2=new Box();
		Box b3=new Box();
		Box b4=new Box();
		b4.showCount();
	}

}
