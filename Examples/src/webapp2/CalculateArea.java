package webapp2;

public class CalculateArea {
		public void ClassArea(int a)
		{
			System.out.println("Area of square:" + a*a);
		}
		public void ClassArea(int a,int b)
		{
			System.out.println("Area of Rectangle:" + a*b);
		}
		public void ClassArea(int a,int b,int c)
		{
			System.out.println("Perimeter of triangle:" + (a+b+c));
		}
		public void ClassArea(int a,int b,int c,int d)
		{
			System.out.println("Area of Quadrilateral:" + (a+b+c+d));
		}
}
