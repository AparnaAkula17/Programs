
public class SwitchStringStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="Orange";
		String shirt="Shirt";
		switch(color)
		{
		case "Blue" : shirt="Blue" + shirt;
			break;
		case "Red" : shirt="Red" + shirt;
		break;
		default:
			shirt = "white" +shirt;
		}
		System.out.println("shirt type:" +shirt);
	}

}
