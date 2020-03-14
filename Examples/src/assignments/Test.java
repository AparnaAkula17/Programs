
package assignments;

class Super
{ 
	int x=2; 
	
}
class Sub extends Super 
{ 
	void displayX()
	{
		System.out.print(x);
	}
	public static void main(String args[])
	{
		new Sub().displayX();
	}
}
