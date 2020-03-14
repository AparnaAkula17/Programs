package interexamples;
import java.util.function.Function;
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
public class FunctionExample {
	public static void main(String[] args)
	{
		User user1=new User("admin","1234");
		User user2=new User("appu","1998");
		/*Predicate<User> tuser=
				u -> u.uid.equals("admin") && u.pwd.equals("1234");
				if(tuser.test(user1))
					System.out.println("Valid User...");
				else
					System.out.println("Invalid User...");
	*/
	Function<User,String> ts= u-> {
									
									if(u.uid.equals("admin") && u.pwd.equals("1234"))
										return "valid user";
									else
										return "invalid user";
								};
	System.out.println(ts.apply(user2));
	}
	
}


