package interexamples;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s=() ->{
									String[] s1= {"Sunny","Bunny","Chinny","Pinny"};
									int x=(int)(Math.random()*2);
									return s1[x];
								};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
