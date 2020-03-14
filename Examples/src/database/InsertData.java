package database;

import java.sql.*;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/cts","root","root");
		Statement statement=connection.createStatement();
		//String query="insert into students values " + "('CTSJAVA105','Srija','ECE','GEC')";
		//String query="update students set branch='MEC' where htno='CTSJAVA103' ";
		String query = "delete from students where htno='CTSJAVA104' ";
		int count=statement.executeUpdate(query);
		System.out.println(count+" Record(s) inserted...");
		statement.close();
		connection.close();
	}
}
