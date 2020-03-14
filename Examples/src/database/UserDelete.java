package database;

import java.sql.*;
import java.util.*;

public class UserDelete{

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter htno to delete");
		String s=sc.nextLine();
		String query = "delete from students where htno=+'htno' ";
		int count=statement.executeUpdate(query);
		System.out.println(count+" Record(s) deleted...");
		statement.close();
		connection.close();
	}
}
