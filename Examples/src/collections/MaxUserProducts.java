package collections;

import java.util.*;
import java.util.stream.Collectors;

class Product3
{
	int id;
	String name;
	String price;
	public Product3(int id, String name, String price)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Product3 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class MaxUserProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product3 p1=new Product3(1001,"Apple","5000");
		Product3 p2=new Product3(1002,"Sony","4000");
		Product3 p3=new Product3(1003,"Voltos","2000");
		Product3 p4=new Product3(1004,"MI","10000");
		Product3 p5=new Product3(1005,"Apple","60000");
		Product3 p6=new Product3(1006,"Apple","4000");
		Product3 p7=new Product3(1007,"Voltos","1000");
		Product3 p8=new Product3(1008,"MI","8000");
		Product3 p9=new Product3(1009,"Voltos","3000");
		Product3 p10=new Product3(1010,"MI","7000");
		ArrayList<Product3> products=new ArrayList<Product3>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
		/*Product3 q=products.stream()
				.filter(p->p.name.equals("Apple"))
				.max((Product3 a,Product3 b)->a.price<b.price?-1:1)
				.get();
		System.out.println(q);*/
		
		List<Product3> list=products.stream()
				.filter(p->p.name.equals("Apple"))
				.sorted((a,b)->a.price.compareTo(b.price))
				.collect(Collectors.toList());
				list.forEach(System.out::println);
	}

}
