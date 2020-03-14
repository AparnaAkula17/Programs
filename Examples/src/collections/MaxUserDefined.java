package collections;

import java.util.ArrayList;
class Product2
{
	int id;
	String name;
	double price;
	public Product2(int id, String name, double price)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Product2 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
public class MaxUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product2 p1=new Product2(1001,"Apple",5000);
		Product2 p2=new Product2(1002,"Sony",4000);
		Product2 p3=new Product2(1003,"Voltos",2000);
		Product2 p4=new Product2(1004,"MI",10000);
		ArrayList<Product2> products=new ArrayList<Product2>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		Product2 p=products.stream()
				.min((Product2 a,Product2 b)->a.price<b.price?-1:1)
				.get();
		System.out.println(p);
		
		Product2 q=products.stream()
				.max((Product2 a,Product2 b)->a.price<b.price?-1:1)
				.get();
		System.out.println(q);
		
	}

}
