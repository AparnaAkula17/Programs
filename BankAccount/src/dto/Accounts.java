package dto;

public class Accounts 
{
	String acno;
	String aname;
	String acktype;
	Float balance;
	public Accounts(String acno, String aname, String acktype, Float balance) 
	{
		super();
		this.acno = acno;
		this.aname = aname;
		this.acktype = acktype;
		this.balance = balance;
	}
	public String getAcno() 
	{
		return acno;
	}
	public void setAcno(String acno) 
	{
		this.acno = acno;
	}
	public String getAname() 
	{
		return aname;
	}
	public void setAname(String aname) 
	{
		this.aname = aname;
	}
	public String getAcktype() 
	{
		return acktype;
	}
	public void setAcktype(String acktype) 
	{
		this.acktype = acktype;
	}
	public Float getBalance() 
	{
		return balance;
	}
	public void setBalance(Float balance) 
	{
		this.balance = balance;
	}
	
}
