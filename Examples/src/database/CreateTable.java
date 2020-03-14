package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable {
	public static void main(String args[])throws ClassNotFoundException,SQLException
	{
	//Class.forName("com.mysql.cj.jdbc.Driver");
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	Connection connection=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/cts","root","root");
	Statement statement=connection.createStatement();
	String query="create table appu(htno int(5),name varchar(10),stream varchar(10))";
	boolean rs=statement.execute(query);
	System.out.println("table created");
	statement.close();
	connection.close();
	}
}


