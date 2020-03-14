package webapp2;
@FunctionalInterface
interface Drawing{
	//public void draw();
	//public int add(int a,int b);
	public void app(int a,int b,int c);
}
/*class Circle implements Drawing{
	public void draw() {
		System.out.println("Circle is drawn...");
	}
}
*/
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Drawing circle= () -> System.out.println("Circle is drawn..");
		//circle.draw();
		//Drawing maths=(a,b) -> a+b;
		//System.out.println("The addition is:" +maths.add(10, 20));
		Drawing sum= (a,b,c) -> System.out.println(a+b+c);
		sum.app(50,40,10);
	}

}
