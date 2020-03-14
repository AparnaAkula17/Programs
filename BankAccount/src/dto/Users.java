package dto;

public class Users 
{
	String name;
	String passwd;
	public Users(String name, String passwd) 
	{
		super();
		this.name = name;
		this.passwd = passwd;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPasswd() 
	{
		return passwd;
	}
	public void setPasswd(String passwd) 
	{
		this.passwd = passwd;
	}
	@Override
	public String toString() 
	{
		return "Users [name=" + name + ", passwd=" + passwd + "]";
	}
	
}
