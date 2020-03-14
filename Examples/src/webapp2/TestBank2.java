package webapp2;
interface RBI2
{
	void savings();
	void loans();
	void deposits();
	default void newReq() {
		System.out.println("inside the new requirement");	
	}
	static void socialService() {
		System.out.println("Social service defined by RBI");
	}
}
class HDFC2 implements RBI2
{
	static void socialService() {
		System.out.println("Social service defined by HDFC");
	}
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
		System.out.println("inside the new requirement of HDFC");
	}
}
class SBI2 implements RBI2
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
public class TestBank2 {
	public static void main(String args[])
	{
		HDFC2 hf=new HDFC2();
		hf.savings();
		hf.loans();
		hf.deposits();
		hf.newReq();
		RBI2.socialService();
		HDFC2.socialService();
		SBI2 si= new SBI2();
		si.savings();
		si.loans();
		si.deposits();
		si.newReq();
	}
}
