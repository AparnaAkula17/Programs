package interexamples;

public class GenericDemo<A,B>{
	A a;
	B b;
	public GenericDemo(A obj1.B obj2)
	{
		a=obj1;
		b=obj2;
	}
	public void display()
	{
		System.out.println(a+","+b);
	}
	public A reta()
	{
		return(a);
	}
	public A retb()
	{
		return(b);
	}
	public static void main(String[] args) {
		GenericDemo<Integer> obj=new GenericDemo<Integer>(11,33);
		int x=(int)obj.reta();
		int y=(int)obj.retb();
		int z=x+y;
		System.out.println("addition is: "+z);
		GenericDemo<String> obj1=new GenericDemo<String>("Hello","World");
		obj1.display();
				
	}
}
