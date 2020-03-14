package webapp2;
abstract class SuperMarket
{
	abstract public void payment();
	abstract public void implementSecurityforOnline();
	public void selectProducts() {
		System.out.println("Goods are selected as per the base comapny rule");
	}
	public void shipmentOfGoods() {
		System.out.println("Goods will be delivered as per Base Company Rules");
	}
}
class Market1 extends SuperMarket{
	public void payment()
	{
		System.out.println("cash payment only..");
	}
	public void implementSecurityforOnline()
	{
		System.out.println("no online security is provided");
	}
}
class Market2 extends SuperMarket{
	public void payment()
	{
		System.out.println("UPI payments only");
	}
	public void implementSecurityforOnline()
	{
		System.out.println("ssh is provided");
	}
}

public class TestSuperMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Market1 m1=new Market1();
		m1.selectProducts();
		m1.shipmentOfGoods();
		m1.payment();
		m1.implementSecurityforOnline();
		Market2 m2=new Market2();
		m2.payment();
		m2.implementSecurityforOnline();
	}

}
