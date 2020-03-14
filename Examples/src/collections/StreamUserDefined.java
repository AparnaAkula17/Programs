package collections;

import java.util.*;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class StreamUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Samsung",5000);
		Product p2=new Product(1002,"Sony",4000);
		Product p3=new Product(1003,"Voltos",2000);
		Product p4=new Product(1004,"MI",10000);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		List<Product> list= products.stream()
				.filter(p->p.price<=2000)
				.map(p->p)
				.collect(Collectors.toList());
		long cnt=products.stream().filter(p->p.price<=2000).count();
		System.out.println(cnt);
		list.forEach(System.out::println);	
	}

}
