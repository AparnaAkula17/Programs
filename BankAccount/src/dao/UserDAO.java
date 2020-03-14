package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Accounts;
import dto.Users;

public class UserDAO 
{
	   private static String jdbcURL;
	   private static String jdbcUsername;
	   private static String jdbcPassword;
	   private static Connection jdbcConnection;
	   
	   public UserDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) 
	   {
	       this.jdbcURL = jdbcURL;
	       this.jdbcUsername = jdbcUsername;
	       this.jdbcPassword = jdbcPassword;
	   }
	   
	   public static void connect() throws SQLException 
	   {
	       if (jdbcConnection == null || jdbcConnection.isClosed()) 
	       {
	           try 
	           {
	               Class.forName("com.mysql.jdbc.Driver");
	           } 
	           catch (ClassNotFoundException e) 
	           {
	               throw new SQLException(e);
	           }
	           jdbcConnection = DriverManager.getConnection(
	                                       jdbcURL, jdbcUsername, jdbcPassword);
	       }
	   }
	   
	   public void disconnect() throws SQLException 
	   {
	       if (jdbcConnection != null && !jdbcConnection.isClosed()) 
	       {
	           jdbcConnection.close();
	       }
	   }
	   
	   public static void createCustomer(Accounts account,Users user) throws SQLException 
	   {
	    	connect();
	    	String sql1 = "insert into users values(?,?)";
	    	String sql2 = "insert into Accounts values (?,?,?,?)";
	    	PreparedStatement pst1 = jdbcConnection.prepareStatement(sql1);
	    	PreparedStatement pst2 = jdbcConnection.prepareStatement(sql2);
	    	pst1.setString(1, user.getName());
	    	pst1.setString(2, user.getPasswd());
	    	pst1.executeUpdate();
	    	pst2.setString(1, account.getAcno());
	    	pst2.setString(2, account.getAname());
	    	pst2.setString(3, account.getAcktype());
	    	pst2.setFloat(4, account.getBalance());
	    	pst2.executeUpdate();
	    	
	    	
	    }
	   public int checkUser(Users user) throws SQLException
	   {
		   String sql="select * from users";
		   int flag=0;
		   connect();
		   Statement statement= jdbcConnection.createStatement();
		   ResultSet resultSet = statement.executeQuery(sql);
		   while(resultSet.next())
		   {
			   	String temp1=resultSet.getString("name");
			   	String temp2=resultSet.getString("passwd");
			   	if(temp1.equals(user.getName())&&temp2.equals(user.getPasswd()))
			   			return 1;
			   	else
			   			return 0;
		   }
		   return flag;
	   }
}
