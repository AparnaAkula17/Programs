package interexamples;

public class FirstDemo extends FirstInter.A implements InnerDemo.B{
	public void greater(int e,int f)
	{
		int h;
		h=(e>f)?e:f;
		System.out.println("The greater is:"+h);
	}
	public static void main(String[] args) {
		FirstDemo obj=new FirstDemo();
		obj.display();
		obj.greater(11,33);
	}

}
