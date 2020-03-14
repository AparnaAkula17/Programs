package webapp2;
interface RBI1
{
	void savings();
	void loans();
	void deposits();
	void newReq();
}
class HDFC1 implements RBI1
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
	public void newReq() {
		System.out.println("inside the new requirement");
	}
}
class SBI1 implements RBI1
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
	public void newReq() {
		System.out.println("SBI has its own new requirement");
	}
}
public class TestBank1 {
	public static void main(String args[])
	{
		HDFC1 hf=new HDFC1();
		hf.savings();
		hf.loans();
		hf.deposits();
		hf.newReq();
		SBI1 si= new SBI1();
		si.savings();
		si.loans();
		si.deposits();
		si.newReq();
	}
}
