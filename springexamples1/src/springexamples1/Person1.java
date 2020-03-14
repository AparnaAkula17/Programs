package springexamples1;

public class Person1 
{
	String id;
	String name;
	Address address;
	public Person1()
	{
		
	}
	public Person1(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void showData()
	{
		System.out.println("Id:"+id+" Name:"+name);
		System.out.println("Dno:"+address.dno+"  Street:"+address.street+"   City:"+address.city );
	}
}
