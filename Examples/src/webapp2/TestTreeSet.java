package webapp2;
import java.util.TreeSet;
class Employ implements Comparable{
	String name;
	String id;
	String dept;
		public Employ(String name, String id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	@Override
	public int compareTo(Emply e) {
		if(dept.compareTo(e.dept)<0)
			return -1;
		else if(dept.compareTo(e.dept)>0)
			return 1;
		else
			return 0;
	}
}
public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tr=new TreeSet();
		/*tr.add(10);
		tr.add(5);
		tr.add(25);
		tr.add(50);*/
		Employ e1=new Employ
		System.out.println(tr);
	}

}
