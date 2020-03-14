package collections;

import java.util.Stack;
import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.addElement("India");
		v.addElement("China");
		v.addElement("Japan");
		System.out.println(v);
		v.insertElementAt("America",2);
		System.out.println(v);
		
		
	}

}
