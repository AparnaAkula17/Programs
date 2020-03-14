package springexamples1;

public class Person 
{
	String id;
	String name;
	String city;
	public String getId() {
	return id;
	}
	public void setId(String id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getCity() {
	return city;
	}
	public void setCity(String city) {
	this.city = city;
	}
	public void showData()

	{
	System.out.println(id+" "+name+" "+city);
	}
}
