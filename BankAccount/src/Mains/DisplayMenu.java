package Mains;

import java.sql.SQLException;
import java.util.Scanner;

import dao.UserDAO;
import dto.Accounts;
import dto.Users;

public class DisplayMenu 
{
	public static void existingUser() throws SQLException {
		UserDAO userdao = new UserDAO("jdbc:mysql://localhost:3306/cts","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Customer Application");
		System.out.println("Enter User name");
		String name = sc.next();
		System.out.println("Enter password");
		String passwd = sc.next();
		Users user = new Users(name,passwd);
		int status = userdao.checkUser(user);
		if(status==1)
			
			System.out.println("Valid User...");
		else
			System.out.println("Invalid user...");
		
		userdao.disconnect();
		 
	}
	public static void newUser() throws SQLException {
		UserDAO userdao = new UserDAO("jdbc:mysql://localhost:3306/cts","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("you have to register first...");
		System.out.println("Enter username");
		String name = sc.next();
		System.out.println("Enter password");
		String passwd = sc.next();
		Users user = new Users(name,passwd);
		System.out.println("Enter AccountNumber");
		String acno = sc.next();
		System.out.println("Enter Customer Name");
		String aname = sc.next();
		System.out.println("Enter AccountType");
		String acktype = sc.next();
		System.out.println("Enter the amount");
		float balance = sc.nextFloat();
		Accounts accounts = new Accounts(acno,aname,acktype,balance);
		UserDAO.createCustomer(accounts, user);
		
	}
	public void showMenuOptions() throws SQLException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***************Bank Application ************");
		System.out.println("1.New User...");
		System.out.println("2.Existing User...");
		System.out.println("Enter your choice...");
		int choice= sc.nextInt();
		switch(choice) 
		{
		case 1: newUser();break;
		case 2:
			  int status=existingUser();
			  if(status==1)
			  {
			   AccountsDAO adao=new AccountsDAO("jdbc:mysql://localhost:3306/cts","root","root");
			   adao.connect();
			   System.out.println("=========================Bank operations=====================");
			   System.out.println("1.Deposit");
			   System.out.println("2.WithDraw");
			   System.out.println("3.GetBalance");
			   System.out.println("4.exit");
			   while(true)
			{
			    System.out.println("Enter ur choice");
			    int ch=sc.nextInt();
			    switch(ch)
			    {
			    case 1:
			    String accountnum;
			    float bal;
			    System.out.println("Enter account number");
			    accountnum=sc.next();
			    System.out.println("Enter amount to add");
			    bal=sc.nextFloat();
			    Accounts accounts=new Accounts(accountnum,bal);
			    adao.Deposit(accounts);
			    System.out.println("Amount added successfully");
			    break;
			    case 2:
			    String accountnum1;
			      float bal1;
			      System.out.println("Enter account number");
			      accountnum1=sc.next();
			      System.out.println("Enter amount to withdraw");
			      bal1=sc.nextFloat();
			      Accounts accounts1=new Accounts(accountnum1,bal1);
			      adao.WithDraw(account1);
			      System.out.println("money is withdrawn and Book Updated");
			      break;  
			    case 3:
			    String accountnum2;
			           System.out.println("Enter account number");
			           accountnum2=sc.next();
			           Accounts accounts2=new Accounts(accountnum2);
			           adao.GetBalance(accounts2);
			           break;
			    case 4:
			default: System.out.println("Wrong Choice...");
			    }
			}
			  }
			}
			}
			
		
		
	}

