package collections;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,String> c1=(a,b) -> System.out.println(a+b);
		c1.accept("hello","hi");
	}

}
