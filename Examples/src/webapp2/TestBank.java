package webapp2;
interface RBI
{
	void savings();
	void loans();
	void deposits();
}
class HDFC implements RBI
{
	public void savings() {
		System.out.println("HDFC rules for savings");
	}
	public void loans() {
		System.out.println("HDFC provides loans for agri,land,education and prsonal");
	}
	public void deposits() {
		System.out.println("HDFC rules for fd minimum amount of 5000");
	}
}
class SBI implements RBI
{
	public void savings() {
		System.out.println("SBI rules for savings");
	}
	public void loans() {
		System.out.println("SBI provides loans for agri,land,education and prsonal");
	}
	public void deposits() {
		System.out.println("SBI rules for fd minimum amount of 500");
	}
}
public class TestBank {
	public static void main(String args[])
	{
		HDFC hf=new HDFC();
		hf.savings();
		hf.loans();
		hf.deposits();
		SBI si= new SBI();
		si.savings();
		si.loans();
		si.deposits();
	}
}
