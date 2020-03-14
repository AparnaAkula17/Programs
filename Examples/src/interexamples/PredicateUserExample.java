package interexamples;
import java.util.function.Predicate;
class User{
	String uid;
	String pwd;
	public User(String uid,String pwd)
	{
		super();
		this.uid=uid;
		this.pwd=pwd;
	}
}
public class PredicateUserExample {
	public static void main(String[] args)
	{
		User user1=new User("admin","1234");
		User user2=new User("appu","1998");
		Predicate<User> tuser=
				u -> u.uid.equals("admin") && u.pwd.equals("1234");
				if(tuser.test(user1))
					System.out.println("Valid User...");
				else
					System.out.println("Invalid User...");
	}
}


